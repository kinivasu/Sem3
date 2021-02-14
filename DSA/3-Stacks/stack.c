#include <stdio.h>
#define MAXSIZE 10
#define ERR -999

typedef struct
{
    int a[MAXSIZE];
    int top;
} STACK;

void push(STACK *s, int item)
{
    if (s->top == MAXSIZE - 1)
    {
        printf("STACK is Full");
        return;
    }
    s->a[++s->top] = item;
}

int pop(STACK *s)
{
    if (s->top == -1)
    {
        printf("Underflow!!!");
        return ERR;
    }
    return s->a[s->top--];
}

void display(STACK *s)
{
    if (s->top == -1)
        printf("Stack is empty");
    else
    {
        printf("Current Stack is:   ");
        for (int i = 0; i <= s->top; i++)
        {
            printf("%d  ", s->a[i]);
        }
    }
}
int main()
{
    STACK s;
    STACK *sptr;
    sptr->top = -1;

    int ch, element, flag = 1;
    printf("--Main Menu--\n1.Push Element\n2.Pop\n3.Display\n4.Exit");
    do
    {
        printf("\n\nEnter your choice:  ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            printf("Enter element to be pushed:  ");
            scanf("%d", &element);
            push(sptr, element);
            break;
        case 2:
            element = pop(sptr);
            if (element != ERR)
            {
                printf("Element %d  popped\n", element);
            }
            else
            {
                printf("Stack is empty, Element can't be popped");
            }
            break;
        case 3:
            display(sptr);
            break;
        case 4:
            flag = 0;
            break;
        default:
            printf("invalid Choice, Try Again..");
        }

    } while (flag);
}