#include <stdio.h>
#include <stdlib.h>

int main(){

    int *p,*first,i;

    //? MALLOC
    p = (int *)malloc(sizeof(int));// allocate memory for 1 integer

    *p = 100; //store a value

    printf("Value stored = %d\n", *p);

    free(p);//release the memory

    //? CALLOC
    printf("Allocation space for 5 integers using calloc\n");
    first = (int *)calloc(5, sizeof(int));//allocate memory for 5 integers

    p = first;
    printf("Enter 5 values \n");
    for(i=0;i<5;i++,p++){
        scanf("%d",p);

    }
    p=first;//point at first location
    printf("Given 5 values \n");
    for(i=0;i<5;i++,p++){
        printf("%d\n",*p);

    }

    //? REALLOC
    printf("Reallocation using realloc\n");
    first = (int *)realloc(first, 10*sizeof(int));//reallocate memory for 10 ints
    p=first;//point at first location
    printf("First 5 values remain same\n");
    for(i=0;i<5;i++,p++){
        printf("%d\n",*p);

    }
    printf("Enter 5 more values \n");
    for(i=0;i<5;i++,p++){
        scanf("%d",p);

    }
    printf("Newly entered values \n");
    p = first + 5;
    for(i=0;i<5;i++,p++){
        printf("%d\n",*p);

    }
    free(first); //release the memory

}