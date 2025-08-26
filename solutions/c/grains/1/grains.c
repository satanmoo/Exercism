#include "grains.h"

uint64_t square(uint8_t index)
{
    uint64_t i;
    uint64_t square = 1;

    if (index == 0)
    {
        return 0;
    }
    
    for (i = 1; i < index; ++i)
    {    
        square *= 2;
    }

    return square;
}

uint64_t total(void)
{
    uint64_t i;
    uint64_t total = 0;

    for (i = 1; i <= 64; ++i)
    {
        total += square(i);
    }

    return total;
}
