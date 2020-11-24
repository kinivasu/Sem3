#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int a[5][5] = {0};
    printf("%p %p", &a[0][0], &a[4][3]);
}