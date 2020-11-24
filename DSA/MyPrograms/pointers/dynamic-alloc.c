#include<stdio.h>
#include<stdlib.h>

void main(){
    int *p , *first, i;
    
    printf("MALLOC\n");
    p = (int *) malloc(10*sizeof(int));

    *p = 1000;

    printf("%d",*p);
}