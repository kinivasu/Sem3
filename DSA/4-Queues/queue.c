#include <stdio.h>
#include <math.h>
#include <ctype.h>

#define MAXSIZE 10

typedef struct
{
    int q[MAXSIZE];
    int front, rear;
} Queue;

void Insert(Queue *s, int item)
{

    if (s->rear == MAXSIZE - 1)
    {
        printf("Queue Full");
        return;
    }
    printf("Item Inserted!!\n");
    s->q[++(s->rear)] = item;
    return;
}

int Delete(Queue *s)
{
    if (s->front == s->rear)
    {
        printf("Q Underflow");
        return (-1);
    }
    //printf("Item Deleted!!\n");
    return (s->q[++(s->front)]);
}
void Display(Queue *s)
{
    int i;
    if (s->front == -1 && s->rear == -1)
    {
        printf("Queue Empty");
        return;
    }
    for (i = s->front + 1; i <= s->rear; i++)
        printf("%d\t", s->q[i]);
    printf("\n");
}

int main()
{
    Queue q1, *qptr;
    qptr = &q1;
    qptr->front = -1;
    qptr->rear = -1;
    Insert(qptr, 10);
    Insert(qptr, 20);
    Insert(qptr, 30);
    Display(qptr);
    printf("\nFirst item Deleted = %d\n", Delete(qptr));
    printf("\nNext item Deleted = %d\n", Delete(qptr));
}
