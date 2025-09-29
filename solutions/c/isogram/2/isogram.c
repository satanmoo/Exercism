#include "isogram.h"

#include <string.h>

bool is_isogram(const char phrase[])
{
    const char* p;
    int word_count_bits = 0;

    if (phrase == NULL) {
        return false;
    }

    for (p = phrase; *p != '\0'; ++p) {
        char ch = *p;
        int mask = 1;

        if (ch == ' ' || ch == '-') {
            continue;
        }

        if (ch <= 'Z') {
            ch += 32;
        }

        mask <<= ch - 'a';

        if ((word_count_bits & mask) != 0) {
            return false;
        } else {
            word_count_bits ^= mask;
        }
    }
    return true;
}