#include "triangle.h"

static int is_triangle(triangle_t triangle)
{
    return (triangle.a + triangle.b > triangle.c) && (triangle.b + triangle.c > triangle.a) && (triangle.a + triangle.c > triangle.b);
}

int is_equilateral(triangle_t triangle)
{
    return is_triangle(triangle) && triangle.a == triangle.b && triangle.a == triangle.c;
}

int is_isosceles(triangle_t triangle)
{
    return is_triangle(triangle) && (triangle.a == triangle.b || triangle.a == triangle.c || triangle.b == triangle.c);
}

int is_scalene(triangle_t triangle)
{
    return is_triangle(triangle) && (triangle.a != triangle.b && triangle.b != triangle.c && triangle.c != triangle.a);
}