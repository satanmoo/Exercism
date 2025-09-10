#include "raindrops.h"
#include <stddef.h>
#include <string.h>

typedef struct {
    int num;
    const char* const str;
    size_t str_size;
} entry_t;

void convert(char result[], int drops)
{
    static const entry_t MAP[] = {
            { 3, "Pling", sizeof("Pling") - 1 },
            { 5, "Plang", sizeof("Plang") - 1 },
            { 7, "Plong", sizeof("Plong") - 1 }
    };

    static const size_t MAP_LEN = sizeof(MAP) / sizeof(MAP[0]);

    char* result_p = result;
    size_t result_index = 0;
    size_t i;
    
    for (i = 0; i < MAP_LEN; ++i) {
        if (drops % MAP[i].num == 0) {
            memcpy(result_p, MAP[i].str, MAP[i].str_size);
            result_index += MAP[i].str_size;
            result_p += MAP[i].str_size;
        }
    }
    if (result_index == 0) {
        while (drops) {
            result[result_index++] = (char)((drops % 10) + '0');
            drops /= 10;
        }
        for (size_t i = 0; i < result_index / 2; ++i) {
            char temp = result[i];
            result[i] = result[result_index - 1 - i];
            result[result_index - 1 - i] = temp;
        }
    }
    result[result_index] = '\0';
}