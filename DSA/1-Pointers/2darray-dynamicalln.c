#include <stdio.h>
#include <stdlib.h>
int main()
{
  int r = 3, c = 3;
  //dynamic memory allocation for a 2d array
  int *arr = (int *)malloc(r * c * sizeof(int));

  int i, j;

  int *p = arr;

  for (i = 0; i < r; i++)
    for (j = 0; j < c; j++)
    {
      scanf("%d", p++);
    }
  p = arr;
  printf("\nThe array you entered is :\n");
  for (i = 0; i < r; i++)
  {
    for (j = 0; j < c; j++, p++)
      printf("%d ", *p);
    printf("\n");
  }

  return 0;
}
