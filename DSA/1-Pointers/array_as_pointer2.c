#include <stdio.h>
int main(){
    int a[]={10,20,30,40,50};

    int *p=a; //pointer to array
    p++;

    printf("%d %d", *a, *p);

}
