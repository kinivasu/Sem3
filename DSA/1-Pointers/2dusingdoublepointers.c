#include<stdio.h>
#include<stdlib.h>

int main(){

    int **A;
    int m,n,i,j;
    printf("Enter no of rows and columns : ");
    scanf("%d %d",&m, &n);
    //allocate space for m pointers to integers
    A=(int**) malloc(m*sizeof(int*));
    for (i=0;i<m;i++)
    {
        A[i]=(int*) malloc(n*sizeof(int));
    }

    for(i=0;i<m;i++)
     for(j=0;j<n;j++)
        scanf("%d",&A[i][j]);
    for(i=0;i<m;i++){
        for(j=0;j<n;j++)
            printf("%d",A[i][j]);
        printf("\n");
    }
}
