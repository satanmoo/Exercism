#include "binary_search.h"

const int* binary_search(int value, const int* arr, size_t length)
{
    int left;
    int right;
    int mid;


    left = 0;
    right = (int)length - 1;

    while (left <= right) {
        mid = (right - left) / 2 + left;
        if (arr[mid] < value) {
            left = mid + 1;
        } else if (arr[mid] > value) {
            right = mid - 1;
        } else {
            return arr + mid;
        }
    }

    return NULL;
}
