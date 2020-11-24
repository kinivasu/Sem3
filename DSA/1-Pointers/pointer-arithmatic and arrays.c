#include <stdio.h>
int main(){
    int a[]={10,20,30,40,50};
    char x[]={'a','b','c'};
    float y[]={10.5, 20.005,3.56};

    int *p;

    p= a;

    printf("Int Array\n");
    printf("%p %p\n", p, a);

    printf("%p %p\n", p+1, a+1);

    printf("%p %p\n", p+2, a+2);

    printf("%p %p\n", p+3, a+3);

    char *c = x;

    printf("Character array\n");
    printf("%p %p\n", c, x);

    printf("%p %p\n", c+1, x+1);

    printf("%p %p\n", c+2, x+2);

    printf("%p %p\n", c+3, x+3);



}
