#include "two_fer.h"

void two_fer(char* buffer, const char* name)
{
    const char* str = "One for you, one for me.";
    int i = 0;
    if (name == NULL) {
        while (str[i] != '\0') {
            buffer[i] = str[i];
            ++i;
        }
    } else {
        int j = 0;
        int k = 0;
        while (str[j] != 'y') {
            buffer[i] = str[j];
            ++i;
            ++j;
        }
        while (name[k] != '\0') {
            buffer[i] = name[k];
            ++i;
            ++k;
        }
        j += 3;
        while (str[j] != '\0') {
            buffer[i] = str[j];
            ++i;
            ++j;
        }
    }
    buffer[i] = '\0';
}
