#include "grains.h"

uint64_t square(uint8_t index)
{
    uint64_t square = 1;

    if (index < 1 || index > 64)
    {
        return 0;
    }
    
    return square << (index - 1);
}

uint64_t total(void)
{
    uint64_t i;
    uint64_t total = 0;
    uint64_t one = 1;

    for (i = 0; i < 64; ++i)
    {
        total += (one << i);
    }

    return total;
}
