#include "allergies.h"

int is_allergic_to(allergen_t allergen, int score)
{
    allergen_list_t list = get_allergens(score);

    return list.allergens[allergen];
}

allergen_list_t get_allergens(int score)
{
    int digit = 0;
    int mod = 0;
    allergen_list_t list;

    list.count = 0;
    memset(list.allergens, 0, ALLERGEN_COUNT * sizeof(bool));

    if (score > (1 << ALLERGEN_COUNT)) {
        score -= (1 << ALLERGEN_COUNT);
    }

    while (score > 0) {
        mod = score % 2;
        if (mod != 0) {
            list.allergens[digit] = mod;
            list.count += 1;
        }
        ++digit;
        score /= 2;
    }

    return list;
}