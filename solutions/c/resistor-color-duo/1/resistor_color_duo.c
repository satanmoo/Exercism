#include "resistor_color_duo.h"

unsigned int color_code(resistor_band_t bands[])
{
    return bands[0] * 10 + bands[1];
}