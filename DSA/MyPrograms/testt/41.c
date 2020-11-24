#include <stdio.h>

typedef struct Node
{
    int data;
    struct Node *next;
} NODE_t;

typedef NODE_t *NODE_p_t;

void removeDuplicates(NODE_p_t list)
{
    NODE_p_t p = list;
    while (p != NULL)
    {
        NODE_p_t temp = p;
        while (temp != NULL && temp->data == p->data)
        {
            p->next = temp->next;
            temp = temp->next;
        }
        p = p->next;
    }
}

void freeMemory(NODE_p_t list)
{
    NODE_p_t p = list;
    while (p != list)
    {
        NODE_p_t temp = p;
        p = p->next;
        free(temp);
    }
    list = NULL;
}