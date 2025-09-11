#include "binary.h"

int convert(const char* input)
{
    int len = 0;
    const char* ptr = input;
    while (*ptr != '\0') {
        if (*ptr != '0' && *ptr != '1') {
            return INVALID;
        }
        len++;
        ptr++;
    }

    int decimal = 0;
    for (int i = len - 1; i >= 0; --i) {
        decimal += (input[i] - '0') << (len - 1 - i);
    }

    return decimal;
}