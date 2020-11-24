#include <stdio.h>
int main(){
    int a[]={10,20,30,40,50};

    int *p;
    int n,i;
    printf("Enter number of elements : ");
    scanf("%d", &n);
    printf("Enter the elements : ");

    for(i=0;i<n;i++)
        scanf("%d",&a[i]);


    int *last = a+n-1;
    printf("\n Array elements in forward direction : \n");
    for(p=a; p<=last;p++)
        printf("%d\n", *p);


    int *first = a;
    printf("\n Array elements in backward direction : \n");
    for(p = last; p>=a;p--)
        printf("%d\n", *p);
}

