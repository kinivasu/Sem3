#include<stdio.h>
int main(){
    char f,g,x,y;
    float sp;
    int a=50;
    int b = 60;
    char c= 'A';
    char d;
    int e;
    int *p;
    char *q;
    printf("Address of f = %p\n",&f);
    printf("Address of g = %p\n",&g);
   // printf("Address of x = %p\n",&x);
   // printf("Address of y = %p\n",&y);
    printf("Address of sp = %p\n",&sp);

    printf("Address of a = %p\n",&a);
    printf("Address of b = %p\n",&b);

    printf("Address of c = %p\n",&c);
    printf("Address of d = %p\n",&d);
    printf("Address of e = %p\n",&e);

    printf("Address of p = %p\n",&p);
    printf("Address of q = %p\n",&q);

    p = &a;
    *p = 10;
    printf("Value of a using its pointer = %d\n",*p);
    printf("Value of a = %d\n",a);
    printf("Address of a using its pointer = %p\n",p);

}
