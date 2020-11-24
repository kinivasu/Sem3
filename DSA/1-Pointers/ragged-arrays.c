#include <stdio.h>
#include <stdlib.h>
int main()
{
    int rowNum, colNum, i, j;
    int **table;

    printf("\n enter the number of rows \n");
    scanf("%d", &rowNum);

    table = (int **)calloc(rowNum + 1, sizeof(int *));

    for (i = 0; i < rowNum; i++) /* this will tell which row we are in */
    {
        printf("\nenter no. of elements in row %d :", i + 1);
        scanf("%d", &colNum);

        table[i] = (int *)calloc(colNum + 1, sizeof(int));
        table[i][0] = colNum;

        printf("\n enter the elements of %d row : ", i + 1);
        for (j = 1; j <= colNum; j++)
            scanf("%d", &table[i][j]);
    }

    table[i] = NULL; //Last row
    printf("Given ragged array: \n");
    printf("No of Elements .... Elements\n");

    for (i = 0; i < rowNum; i++) /* this will tell which row we are in */
    {
        for (j = 0; j <= *table[i]; j++)
            printf("%5d", table[i][j]);
        printf("\n");
    }
    for (i = 0; i < rowNum; i++)
        free(table[i]);
    free(table);
    return 0;
}
