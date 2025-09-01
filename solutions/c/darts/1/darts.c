#include "darts.h"

uint8_t score(coordinate_t p)
{
    float dist;
    dist = p.x * p.x + p.y * p.y;
    if (dist > 100) {
        return 0;
    } else if (dist > 25) {
        return 1;
    } else if (dist > 1) {
        return 5;
    }
    return 10;
}