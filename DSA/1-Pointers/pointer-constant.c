#include <stdio.h>
int main()
{
    int a = 50;
    int b = 60;
    int c;
    int *p;
    char *q;

    printf("Address of a = %p\n", &a);
    //printf("Address of a = %X\n",&a);
    printf("Address of b = %p\n", &b);
    printf("Address of c = %p\n", &c);

    printf("Address of p = %p\n", &p);
    printf("Address of q = %p\n", &q);

    p = &a;
    *p = 10;
    printf("Value of a = %d\n", a);
    printf("Value of a using its pointer = %d\n", *p);
    printf("Address of a using its pointer = %p\n", p);
}
