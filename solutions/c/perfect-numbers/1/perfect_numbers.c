#include "perfect_numbers.h"
#include <math.h>

kind classify_number(int num)
{
    if (num <= 0) {
        return ERROR;
    }

    int aliquot_sum = 1;
    int int_sqrt = (int)sqrt(num);
    int i;
    for (i = 2; i <= int_sqrt; ++i) {
        if (num % i == 0) {
            aliquot_sum += i;
            aliquot_sum += num / i;
        }
    }

    if (int_sqrt * int_sqrt == num) {
        aliquot_sum -= int_sqrt;
    }

    if (num > aliquot_sum) {
        return DEFICIENT_NUMBER;
    } else if (num < aliquot_sum) {
        return ABUNDANT_NUMBER;
    }
    return PERFECT_NUMBER;
}