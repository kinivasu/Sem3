#include<stdio.h>
#include<stdlib.h>
int main(){
    int *p1 = (int *)malloc (sizeof(int));
    int i;
    *p1 = 100;

    printf("%p %d\n",p1, *p1 );

    free(p1);

    printf("calloc : \n");
    int *p2 = (int *)calloc(5,sizeof(int));

    int *p3 = p2;

    for(i=0;i<5;i++,p3++)
        *p3 = i+1;

    p3 = p2;

    for(i=0;i<5;i++,p3++)
        printf("%p %d\n", p3, *p3);


    //free(p2);
    printf("Calloc : \n");

    calloc(p2, 10*sizeof(int));
    p3 = p2;
    for(i=0;i<10;i++,p3++)
        printf("%p %d\n", p3, *p3);

}
