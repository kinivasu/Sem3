#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 10
#define ERR -9999

typedef struct
{
    char a[MAX];
    int top;
} stack;

void init(stack *);
void push(stack *, char);
int pop(stack *);
int isEmpty(stack *);

void init(stack *s)
{
    s->top = -1;
}
void push(stack *s, char x)
{
    if (s->top == MAX - 1)
    {
        printf("Stack overflow");
        return;
    }
    else
    {
        s->top = s->top + 1;
        s->a[s->top] = x;
    }
}
int isEmpty(stack *s)
{
    if (s->top == -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
int pop(stack *s)
{
    int y;
    if (isEmpty(s))
    {
        printf("Stack underflow");
        return ERR;
    }
    else
    {
        y = s->a[s->top];
        s->top = s->top - 1;
    }
    return y;
}

void main()
{
    stack sh;
    int i;
    int j = 0;
    init(&sh);
    char *x = (char *)calloc(MAX, sizeof(char));
    char *y = (char *)calloc(MAX, sizeof(char));
    printf("Enter string: ");
    scanf("%s", x);
    printf("String: %s\n", x);
    for (i = 0; i < strlen(x); i++)
    {
        push(&sh, *(x + i));
    }
    for (i = 0; i < strlen(x); i++)
    {
        *(y + i) = pop(&sh);
    }

    int flag = 1;
    for (i = 0; i < strlen(x); i++)
    {
        if (*(x + i) != *(y + i))
        {
            flag++;
        }
        else
        {
            continue;
        }
    }
    if (flag == 1)
    {
        printf("Palindrome");
    }
    else
    {
        printf("Not a palindrome");
    }
}