#ifndef RAINDROPS_H
#define RAINDROPS_H

#include <stddef.h>

typedef struct {
    int num;
    const char* const str;
    size_t str_size;
} entry_t;


void convert(char result[], int drops);

#endif
