#include "luhn.h"

bool luhn(const char* num)
{
    size_t len;
    size_t num_count = 0;
    size_t sum = 0;
    size_t num_index = 0;
    size_t i;

    for (len = 0; num[len] != '\0'; ++len) {
        if (num[len] >= '0' && num[len] <= '9') {
            ++num_count;
        } else if (num[len] != ' ') {
            return false;
        }
    }

    if (num_count <= 1) {
        return false;
    }

    for (i = 0; i < len; ++i) {
        char ch = num[len - 1 - i];
        int digit;
        int doubled;

        if (ch == ' ') {
            continue;
        }
        digit = ch - '0';

        if ((num_index & 1) != 0) {
            doubled = digit * 2;
            if (doubled > 9) {
                doubled -= 9;
            }
            sum += doubled;
        } else {
            sum += digit;
        }
        num_index += 1;
    }

    return (sum % 10) == 0;
}
