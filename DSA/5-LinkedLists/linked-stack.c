#include <stdio.h>
#include <stdlib.h>

//self referential structure
typedef struct node *Nodeptr;

typedef struct node
{
    int data;
    Nodeptr next;
} Node;

Nodeptr getnode()
{
    Nodeptr temp;

    temp = (Nodeptr)malloc(sizeof(Node));
    if (temp == NULL)
    {
        printf("No Memory Space");
        exit(0);
    }
    return temp;
}

void Push(Nodeptr *top, int x)
{
    Nodeptr temp;

    temp = getnode();
    temp->data = x;
    temp->next = NULL;

    if (*top == NULL) //stack is empty
        *top = temp;

    else
    {
        temp->next = *top;
        *top = temp;
    }
}

void Display(Nodeptr top)
{
    Nodeptr temp = getnode();

    temp = top;
    printf("\nContents of Stack : \n");
    while (temp)
    {
        printf("%d\n", temp->data);
        temp = temp->next;
    }
}

int Pop(Nodeptr *top)
{
    Nodeptr temp;
    int x;

    if (*top == NULL)
    {
        printf("Empty Stack\n");
        return -999; //error
    }

    temp = *top;
    x = temp->data;
    *top = (*top)->next;
    free(temp);
    return x;
}
int main()
{
    Nodeptr top = NULL; //stack is empty

    Push(&top, 30);
    Display(top);

    Push(&top, 20);
    Display(top);

    Push(&top, 10);
    Display(top);

    int x;
    x = Pop(&top);
    printf("\nItem deleted from top = %d", x);

    x = Pop(&top);
    printf("\nItem deleted from top = %d", x);

    Display(top);

    return 0;
}
