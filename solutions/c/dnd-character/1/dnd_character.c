#include "dnd_character.h"

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int ability(void)
{
    int min = 3;
    int max = 18;

    srand((unsigned)time(NULL));

    return rand() % (max - min + 1) + min;
}

int modifier(int score)
{
    return (score - 10) % 2 == -1 ? (score - 10) / 2 - 1 : (score - 10) / 2;
}

dnd_character_t make_dnd_character(void)
{
    dnd_character_t result;
    result.strength = ability();
    result.dexterity = ability();
    result.constitution = ability();
    result.intelligence = ability();
    result.wisdom = ability();
    result.charisma = ability();
    result.hitpoints = 10 + modifier(result.constitution);

    return result;
}
