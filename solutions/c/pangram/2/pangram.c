#include "pangram.h"

#include <stdbool.h>
#include <stddef.h>

bool is_pangram(const char* sentence)
{
    int used = 0;
    const char* p = sentence;

    if (sentence == NULL)
    {
        return false;
    }

    while (*p != '\0') {
        char ch = *p;
        ch |= ('a' - 'A');
        if (ch >= 'a' && ch <= 'z') {
            used |= (1 << (ch - 'a'));
        }
        ++p;
    }

    return (1 << ('z' - 'a' + 1)) - 1 == used;
}
