#include "eliuds_eggs.h"

unsigned int egg_count(const unsigned int egg)
{
    unsigned int result = 0;
    int input = egg;
    while (input) {
        if (input % 2) {
            ++result;
        }
        input = input / 2;
    }

    return result;
}
