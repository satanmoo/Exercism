#include "raindrops.h"
#include <stddef.h>
#include <string.h>
#include <stdio.h>

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

    size_t result_index = 0;
    size_t i;

    for (i = 0; i < MAP_LEN; ++i) {
        if (drops % MAP[i].num == 0) {
            memcpy(&result[result_index], MAP[i].str, MAP[i].str_size);
            result_index += MAP[i].str_size;
        }
    }
    result[result_index] = '\0';

    if (result_index == 0) {
        sprintf(result, "%d", drops);
    }
}