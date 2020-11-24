#include <stdio.h>
int main(){

    int a[]={10,20,30,40,50};

    printf("Array Name is base address :\n");
    printf("%p %p\n", a, &a[0]);

    printf("%d %d\n", *a,a[0]);

    //a++; error
    *a = 60;

}
