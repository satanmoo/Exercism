#include "hamming.h"

int compute(const char* lhs, const char* rhs)
{
    int count = 0;

    while (*lhs != '\0' && *rhs != '\0') {
        if (*lhs != *rhs) {
            count++;
        }
        ++lhs;
        ++rhs;
    }

    if (*lhs == *rhs) {
        return count;
    }

    return INVALID;
}
