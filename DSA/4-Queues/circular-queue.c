#include <stdio.h>
#define Maxsize 5
#define ERR -999

typedef int T;

typedef struct
{
    T arr[Maxsize];
    int Front;
    int Rear;
} CQ;

int IsEmpty(CQ *q)
{
    return q->Front == q->Rear;
}
int IsFull(CQ *q)
{
    int k = (q->Rear + 1) % Maxsize;
    return (q->Front == k);
}
void Insert(CQ *q, T item)
{
    if (IsFull(q))
    {
        printf("\nQueue Overflow\n");
        return;
    }
    printf("\nInserted %d", item);
    q->Rear = (q->Rear + 1) % Maxsize;
    q->arr[q->Rear] = item;
}

T Delete(CQ *q)
{
    if (IsEmpty(q))
    {
        printf("Queue Underflow");
        return ERR;
    }
    q->Front = (q->Front + 1) % Maxsize;
    return (q->arr[q->Front]);
}
void Display(CQ *q)
{
    int i;
    printf("\nQueue Contents : \n");
    for (i = (q->Front + 1) % Maxsize; i != q->Rear; i = (i + 1) % Maxsize)
        printf("%d \t", q->arr[i]);
    printf("%d \t", q->arr[i]);
}

int main()
{
    CQ q1, *q;
    q = &q1;
    q->Front = 0;
    q->Rear = 0;
    Insert(q, 10);
    Insert(q, 20);
    Insert(q, 30);
    Insert(q, 40);
    Insert(q, 50);
    Display(q);

    printf("\nElement Deleted : %d", Delete(q));
    Insert(q, 60);
    Display(q);
}