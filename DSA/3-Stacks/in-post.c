#include <stdio.h>
#include <math.h>
#include <ctype.h>

#define MaxSize 100
typedef struct
{
    char stack[MaxSize];
    int top;
} STACK;

void Push(STACK *s, char item)
{
    if (s->top == MaxSize - 1)
    {
        printf("Stack Overflow");
        return;
    }
    s->stack[++s->top] = item;
}
char Pop(STACK *s)
{
    if (s->top < 0)
    {
        printf("Stack Underflow");
        return '#';
    }
    return (s->stack[s->top--]);
}

int isp(char x)
{ //in-stack precedence
    switch (x)
    {
    case '^':
        return 3;
        //Rt associative - lower value than icp(^) so as to
        //push incoming ^
    case '*':
    case '/':
        return 2;
    case '+':
    case '-':
        return 1;
    case '(':
        return 0;
    case '#':
        return -1;
    }
}
int icp(char x)
{ //incoming precedence
    switch (x)
    {
    case '(':
        return 4;
    case '^':
        return 4;
    case '*':
    case '/':
        return 2;
    case '+':
    case '-':
        return 1;
    }
}
void infix_postfix(char infix[], char postfix[])
{
    STACK *s, s1;
    int i = 0, j = 0;
    int k, p;
    char x, y;

    s = &s1;
    s->top = -1;
    Push(s, '#');
    for (x = infix[i]; x != '\0'; i++, x = infix[i])
    {
        if (isdigit(x))
        {
            postfix[j++] = x;
        }
        else if (x == ')')
        {
            y = Pop(s);
            while (y != '(')
            {
                postfix[j++] = y;
                y = Pop(s);
            }
        }
        else
        {
            y = Pop(s);
            while (isp(y) >= icp(x))
            {
                postfix[j++] = y;
                y = Pop(s);
            }

            Push(s, y); //last operator that is popped
            Push(s, x); //incoming operator
        }
        printf("%c\t", x);
        for (k = 0; k <= s->top; k++)
            printf("%c ", s->stack[k]);
        printf("\t\t");
        for (p = 0; p < j; p++)
            printf("%c", postfix[p]);
        printf("\n");
    }

    y = Pop(s); //pop until eos

    while (y != '#')
    {
        postfix[j++] = y;
        y = Pop(s);
    }

    postfix[j] = '\0';
}
int main()
{

    char infix[10], postfix[10];

    printf("Enter an infix expression :");
    scanf("%s", infix);

    infix_postfix(infix, postfix);
    printf("Postfix = %s", postfix);
    return 0;
}
