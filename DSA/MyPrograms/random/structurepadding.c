#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    int data;
    struct Node *next;
} NODE_t;

typedef NODE_t *NODE_p_t;

void main()
{
    NODE_p_t A = (NODE_p_t)malloc(sizeof(NODE_t));
    printf("%d\n", (int)sizeof(*A));
    printf("%d\n", (int)sizeof(A));
}