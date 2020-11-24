#include <stdio.h>
int main(){
    int a[]={10,20,30,40,50};

    int *p;

    p= &a[1]; // point to 2nd element of the array ie a[1]

    printf("%d %d %p %p\n", a[0], p[-1], &a[0],&p[-1]);
    printf("%d %d %p %p\n", a[1], p[0],&a[1], &p[0]);

    p[1]=45;
    printf("%d %d", a[2],p[1]);
}
