#include "high_scores.h"

#include <stdlib.h>
#include <string.h>

void quick_sort_recursive(int32_t* scores, size_t left, size_t right)
{
    size_t pivot = right;
    size_t next = left;
    size_t i;
    int32_t temp;

    if (scores == NULL) {
        return;
    }

    if (left >= right) {
        return;
    }

    for (i = left; i < right; ++i) {
        if (scores[i] < scores[pivot]) {
            continue;
        }
        temp = scores[next];
        scores[next] = scores[i];
        scores[i] = temp;
        ++next;
    }

    temp = scores[next];
    scores[next] = scores[pivot];
    scores[pivot] = temp;

    if (left < next) {
        quick_sort_recursive(scores, left, next - 1);
    }
    if (next < right) {
        quick_sort_recursive(scores, next + 1, right);
    }
}

int32_t latest(const int32_t* scores, size_t scores_len)
{
    return scores[scores_len - 1];
}

int32_t personal_best(const int32_t* scores, size_t scores_len)
{
    int32_t result = INT32_MIN;
    size_t i;
    for (i = 0; i < scores_len; ++i) {
        if (scores[i] > result) {
            result = scores[i];
        }
    }
    return result;
}

size_t personal_top_three(const int32_t* scores, size_t scores_len, int32_t* output)
{
    size_t count = 0;
    int32_t* copy;

    copy = (int32_t*)malloc(sizeof(int32_t) * scores_len);
    memcpy(copy, scores, sizeof(int32_t) * scores_len);

    quick_sort_recursive(copy, 0, scores_len - 1);

    if (scores_len >= 3) {
        memcpy(output, copy, sizeof(int32_t) * 3);
        count = 3;
    } else if (scores_len >= 1) {
        memcpy(output, copy, sizeof(int32_t) * scores_len);
        count = scores_len;
    } else {
        count = 0;
    }

    free(copy);

    return count;
}