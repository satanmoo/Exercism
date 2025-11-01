#include "allergies.h"

int is_allergic_to(allergen_t allergen, int score)
{
    return ((1 << allergen) & score) > 0;
}

allergen_list_t get_allergens(int score)
{
    allergen_list_t result;
    allergen_t allergen;

    result.count = 0;
    memset(result.allergens, 0, ALLERGEN_COUNT * sizeof(bool));

    for (allergen = ALLERGEN_EGGS; allergen < ALLERGEN_COUNT; ++allergen) {
        if (is_allergic_to(allergen, score)) {
            result.allergens[allergen] = 1;
            result.count += 1;
        }
    }

    return result;
}