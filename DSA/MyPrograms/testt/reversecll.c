#include <stdio.h>
#include <stdlib.h>

typedef struct list_node *list_pointer;

struct list_node
{
    int data;
    list_pointer link;
};

void reverse(list_pointer *first)
{
    // if list is empty
    if (*first == NULL)
        return;

    list_pointer prev = NULL;
    list_pointer current = *first;
    list_pointer link;
    do
    {
        link = current->link;
        current->link = prev;
        prev = current;
        current = link;
    } while (current != (*first));

    // adjutsing the links so as to make the
    // last list_node point to the first list_node
    (*first)->link = prev;
    *first = prev;
}