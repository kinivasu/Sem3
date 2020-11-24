#include <stdio.h>
int main(){
    int x;

    int *p;
    int *q;

    p = &x;
    q = &x;

    x = 4;

    printf("Value of x using its pointer p = %d\n", *p);
    printf("Value of x using its pointer q = %d\n", *q);

    x = x+1;

    *p = 8;
    printf("Value of x = %d\n", x);

    x = *p + *q;

    printf("Value of x = %d\n", x);

    x = *p /*q;

    printf("Value of x = %d\n", x);

}
