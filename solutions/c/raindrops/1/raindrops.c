#include "raindrops.h"

void convert(char result[], int drops)
{
    static const char* const a = "Pling";
    static const char* const b = "Plang";
    static const char* const c = "Plong";

    static entry_t map[3];
    map[0].num = 3;
    map[0].str = a;
    map[0].str_size = 5;
    map[1].num = 5;
    map[1].str = b;
    map[1].str_size = 5;
    map[2].num = 7;
    map[2].str = c;
    map[2].str_size = 5;

    int result_index = 0;
    int bFlag = 0;
    for (int i = 0; i < 3; ++i) {
        if (drops % map[i].num == 0) {
            bFlag = 1;
            for (size_t j = 0; j < map[i].str_size; ++j) {
                result[result_index++] = map[i].str[j];
            }
        }
    }
    if (!bFlag) {
        while (drops) {
            result[result_index++] = (char)((drops % 10) + '0');
            drops /= 10;
        }
        for (int i = 0; i < result_index / 2; ++i) {
            result[i] = result[i] ^ result[result_index - 1 - i];
            result[result_index - 1 - i] = result[i] ^ result[result_index - 1 - i];
            result[i] = result[i] ^ result[result_index - 1 - i];
        }
    }
    result[result_index] = '\0';
}