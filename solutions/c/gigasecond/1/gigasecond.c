#include "gigasecond.h"

void gigasecond(time_t input, char* output, size_t size)
{
    struct tm* tm_future;
    
    time_t future = input + 1000000000; /* 1 gigasecond later */

    /* UTC 기준 변환 */
    tm_future = gmtime(&future);
    if (tm_future == NULL) {
        if (size > 0) {
            output[0] = '\0';
        }
        return;
    }

    /* 결과 문자열 포맷 */
    strftime(output, size, "%Y-%m-%d %H:%M:%S", tm_future);
}