#include "rna_transcription.h"

char* to_rna(const char* dna)
{
    char* result = malloc(100);
    char* temp = result;
    while (*dna != '\0') {
        if (*dna == 'G') {
            *temp = 'C';
        } else if (*dna == 'C') {
            *temp = 'G';
        } else if (*dna == 'T') {
            *temp = 'A';
        } else if (*dna == 'A') {
            *temp = 'U';
        }
        ++dna;
        ++temp;
    }
    *temp = '\0';
    return result;
}