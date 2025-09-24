#include "resistor_color_trio.h"

resistor_value_t color_code(const resistor_band_t input[])
{
    resistor_value_t result;
    long num = 0;
    int i;
    for (i = 0; i < 2; ++i) {
        num = 10 * num + (long)input[i];
    }

    for (i = 0; i < (int)input[2]; ++i) {
        num *= 10;
    }

    i = 0;
    while (num > 1000) {
        num /= 1000;
        ++i;
    }

    result.value = (int)num;
    result.unit = (metric_t)i;
    return result;
}