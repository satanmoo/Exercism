#include "high_scores.h"

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
    int32_t first = INT32_MIN;
    int32_t second = INT32_MIN;
    int32_t third = INT32_MIN;
    size_t i;
    size_t count = 0;
    for (i = 0; i < scores_len; ++i) {
        if (scores[i] > first) {
            third = second;
            second = first;
            first = scores[i];
        } else if (scores[i] > second) {
            third = second;
            second = scores[i];
        } else if (scores[i] > third) {
            third = scores[i];
        }
    }

    if (scores_len == 0) {
        return 0;
    }

    if (scores_len >= 1) {
        output[count++] = first;
    }
    if (scores_len >= 2) {
        output[count++] = second;
    }
    if (scores_len >= 3) {
        output[count++] = third;
    }

    return count;
}