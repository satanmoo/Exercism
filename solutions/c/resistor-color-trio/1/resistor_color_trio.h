#ifndef RESISTOR_COLOR_TRIO_H
#define RESISTOR_COLOR_TRIO_H

typedef enum {
    OHMS,
    KILOOHMS,
    MEGAOHMS,
    GIGAOHMS
} metric_t;

typedef enum {
    BLACK,
    BROWN,
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    VIOLET,
    GREY,
    WHITE
} resistor_band_t;

typedef struct {
    int value;
    metric_t unit;
} resistor_value_t;

resistor_value_t color_code(const resistor_band_t input[]);

#endif
