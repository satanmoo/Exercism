#include "collatz_conjecture.h"

int steps(int start)
{
    return steps_recursive(start, 0);
}

int steps_recursive(int number, int depth)
{
    if (number <= 0)
    {
        return ERROR_VALUE;
    }
    
    if (number == 1)
    {
        return depth;
    }

    if ((number & 1) == 0)
    {
        return steps_recursive(number >> 1, depth + 1);
    }
    return steps_recursive(3 * number + 1, depth + 1);
}