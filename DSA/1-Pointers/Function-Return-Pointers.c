#include<stdio.h>

int* Smaller(int *px, int *py){
    int s;
    s = *px<*py? *px:*py;
    return &s;//Error : function returning address of a local variable
}


//? The right answer would be:
//* int* Smaller(int *px, int *py){
//*     int * s;
//*     s = *px < *py ? px : py;
//*     return s;
//* }

int main(){
    int a,b;
    int* p;

    printf("Enter values of a and b:");
    scanf("%d %d",&a,&b);
    p = Smaller(&a,&b);

    printf("Smaller value : %d",*p);
}