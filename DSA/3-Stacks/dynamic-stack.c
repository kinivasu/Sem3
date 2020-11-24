#include <stdio.h>
#include <stdlib.h>

int capacity = 2;

typedef struct
{
    int key;

} element;

int top = -1;
element *Stack;

void StackFull()
{
    Stack = realloc(Stack, 2 * capacity * sizeof(element));
    capacity *= 2;
}
void Push(element x)
{
    if (top >= capacity - 1)
    {
        printf("Stack Full ... Reallocating Memory\n");
        StackFull();
    }
    Stack[++top] = x;
    printf("Element Pushed: %d\n", x.key);
}

element Pop()
{
    return Stack[top--];
}

int main()
{

    Stack = (element *)calloc(capacity, sizeof(element));

    element x;
    x.key = 10;
    Push(x);
    x.key = 20;
    Push(x);
    x.key = 30;
    Push(x);
}
