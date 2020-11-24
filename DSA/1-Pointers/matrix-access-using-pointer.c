#include <stdio.h>

int main(){

    int a[3][3]= {
                    {50, 70, 30},
                    {10, 60, 40},
                    {80, 20, 90}
                    };
    int j,i;

    int *p;

    printf("Printing Address and elements of 2D array using & operator\n");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++)
            printf("%p-> %d ",&a[i][j], a[i][j]);
        printf("\n");

    }

    printf("\nrow major order\n\n");


    p = &a[0][0];//a[0] or *a
    for(j=0;j<3;j++){
        for(i=0;i<3;i++,p++)
            printf("%p-> %d ",p,*p);
        printf("\n");

    }

    printf("\nColumn major order\n\n");
    for(j=0;j<3;j++){
        int *p = *(a+0)+j;
        for(i=0;i<3;i++,p=p+3)
            printf("%p %d ",p,*p);
        printf("\n");
    }

}
