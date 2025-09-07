#include "eliuds_eggs.h"

unsigned int egg_count(const unsigned int egg)
{
    unsigned int result = 0;
    unsigned int bits = egg;
    while (bits) {
        ++result;
        bits &= bits - 1;
    }

    return result;
}
