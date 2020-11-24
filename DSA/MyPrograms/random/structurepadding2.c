#include <stdio.h>
#include <stdlib.h>

typedef struct Node *Nodeptr;

struct Node
{
    int data;
    Nodeptr next;
};

void main()
{
    Nodeptr A;
    A = (Nodeptr)malloc(sizeof(struct Node));
    printf("%d\n", (int)sizeof(*A));
    printf("%d\n", (int)sizeof(A));
}