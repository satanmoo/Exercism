#include "space_age.h"

float age(planet_t planet, int64_t seconds)
{
    float result = (float)seconds / 31557600.0f;

    switch (planet) {
    case MERCURY:
        return result / 0.2408467f;
    case VENUS:
        return result / 0.61519726f;
    case EARTH:
        return result / 1.0f;
    case MARS:
        return result / 1.8808158f;
    case JUPITER:
        return result / 11.862615f;
    case SATURN:
        return result / 29.447498f;
    case URANUS:
        return result / 84.016846f;
    case NEPTUNE:
        return result / 164.79132f;
    }

    return INVALID;
}