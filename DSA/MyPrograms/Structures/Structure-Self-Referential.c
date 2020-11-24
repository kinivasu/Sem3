#include <stdio.h>
#include <stdlib.h>

typedef struct node *nodeptr;

struct node
{
    int a;
    char c;
    nodeptr next;
};

int main()
{
    struct node var1;
    struct node var2;

    var1.a = 1;
    var1.c = 'a';
    var1.next = NULL;

    var2.a = 2;
    var2.c = 'b';
    var2.next = NULL;

    var1.next = &var2;

    printf("%d %c\n", var1.next->a, var1.next->c);
    return 0;
}
