#include <stdio.h>

int fix(int n)
{
    if (n == 0)
        return 0;
    if (n == 1)
        return 1;
    else
    {
        printf("FIBO\n");
        return (fix(n - 1) + fix(n - 1));
    }
}
void main()
{
    int num, fnum;
    num = 5;
    fnum = fix(num);
    printf("%d", fnum);
}