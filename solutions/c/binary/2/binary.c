#include "binary.h"

int convert(const char* input)
{
    int decimal = 0;
    const char* ptr = input;
    while (*ptr != '\0') {
        if (*ptr != '0' && *ptr != '1') {
            return INVALID;
        }
        decimal = 2 * decimal + (*ptr - '0');
        ptr++;
    }

    return decimal;
}