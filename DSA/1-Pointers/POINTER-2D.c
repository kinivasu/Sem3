#include <stdio.h>

int main()
{
    int a[3][3] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int i, j;
    int(*p)[3];
    printf("Given array elements :  \n");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
            printf("%d   ", a[i][j]);
        printf("\n");
    }

    printf("Address of individual elements :  \n");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
            printf("%p    ", &a[i][j]);
        ;
        printf("\n");
    }

    p = a; //initialization

    printf("\nAddress of first row = &a[0] : %p\n", &a[0]);     //address of first row
    printf("Address of first row using pointer = p : %p\n", p); //pointer to first row

    printf("Address of ith row = &a[1] : %p\n", &a[1]);
    printf("Address of ith row using pointer = p+1 : %p\n", p + 1);

    printf("\nAddress of first element in ith row = *(p+1) : %p\n", *(p + 1) + 0);
    printf("Address of jth element in ith row = *(p+1)+0  : %p\n", *(p + 1) + 0);
    printf("Address of jth element in ith row = *(p+1)+1  : %p\n", *(p + 1) + 1);
    printf("Address of jth element in ith row = *(p+1)+2  : %p\n", *(p + 1) + 2);
    printf("Value at a[0][2] = *(*(p)+2) : %d\n", *(*(p) + 2));
    printf("Value at a[1][2] = *(*(p+1)+2) : %d", *(*(p + 1) + 2));
}
