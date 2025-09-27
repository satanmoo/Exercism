#include "isogram.h"

#include <string.h>

bool is_isogram(const char phrase[])
{
    int word_count[26];
    const char* p;

    if (phrase == NULL) {
        return false;
    }

    memset(word_count, 0, 26 * sizeof(int));
    for (p = phrase; *p != '\0'; ++p) {
        char ch = *p;

        if (ch == ' ' || ch == '-') {
            continue;
        }

        if (ch <= 'Z')
        {
            ch += 32;
        }

        if (word_count[ch - 'a'] != 0) {
            return false;
        } else {
            word_count[ch - 'a'] = 1;
        }
    }
    return true;
}