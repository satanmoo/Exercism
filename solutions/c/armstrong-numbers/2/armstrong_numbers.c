#include "armstrong_numbers.h"

static int power_of(int num, int e)
{
    int i;
    int result = 1;
    for (i = 0; i < e; ++i) {
        result *= num;
    }

    return result;
}

bool_t is_armstrong_number(int candidate)
{
    int sum = 0;
    int digits = 0;
    int remaining = candidate;

    if (candidate < 0) {
        return FALSE;
    }

    while (remaining > 0) {
        digits++;
        remaining /= 10;
    }

    remaining = candidate;
    while (remaining > 0) {
        sum += power_of((remaining % 10), digits);
        remaining /= 10;
    }

    return candidate == sum;
}