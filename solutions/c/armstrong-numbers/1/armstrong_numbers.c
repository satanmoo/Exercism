#include "armstrong_numbers.h"

int _pow(int num, int e)
{
    int i;
    int result = 1;
    for (i = 0; i < e; ++i) {
        result *= num;
    }

    return result;
}

bool is_armstrong_number(int candidate)
{
    int sum = 0;
    int digits = 0;
    int copy = candidate;
    while (copy > 0) {
        digits++;
        copy /= 10;
    }

    copy = candidate;
    while (copy > 0) {
        sum += _pow((copy % 10), digits);
        copy /= 10;
    }

    return candidate == sum;
}
