#include <stdio.h>

int main(){

    int a[3][3]= {
                    {50, 70, 30},
                    {10, 60, 40},
                    {80, 20, 90}
                    };
    int j,i;

    printf("Address of 2D array or address of first row: %p\n", a);
    printf("Address of 2nd row: %p\n", a+1);
    printf("Address of 3rd row: %p\n", a+2);

    //Printing addresses using pointer expression and address of operator
    printf("\nAddress of 1st row 1st element = *(a+0)+0  or &a[0][0] : %p  %p\n",*(a+0)+0, &a[0][0]);
    printf("Address of 1st row 2nd element = *(a+0)+1  or &a[0][1] : %p  %p\n",*(a+0)+1, &a[0][1]);
    printf("Address of 2nd row 1st element = *(a+1)+0  or &a[1][0] : %p  %p\n",*(a+1)+0, &a[1][0]);
    printf("Address of 2nd row 2nd element = *(a+1)+1  or &a[1][1] : %p  %p\n",*(a+1)+1, &a[1][1]);

    //printing values using pointer expression
    printf("\nprinting values using pointer arithmatic of 2D array :\n");
    printf("Value of 1st row 1st element = *(*(a+0)+0) : %d\n",*(*(a+0)+0));
    printf("Value of 1st row 2nd element = *(*(a+0)+1) : %d\n",*(*(a+0)+1));
    printf("Value of 2nd row 1st element = *(*(a+1)+0) : %d\n",*(*(a+1)+0));
    printf("Value of 2nd row 2nd element = *(*(a+1)+1) : %d\n",*(*(a+1)+1));

    //Printing both address and value
    printf("row major order \n\n");
    for(i=0;i<3;i++){
    for(j=0;j<3;j++)
        printf("%p-> %d ", (*(a+i)+j), *(*(a+i)+j));
    printf("\n");
    }
}
