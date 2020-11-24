#include<stdio.h>
#include<math.h>
#include<ctype.h>

#define MaxSize 10
typedef struct{
    int q[MaxSize];
    int front,rear;
}Queue;

void Insert(Queue *s,int item){
    
    if (s->rear==MaxSize-1)
    {
        printf("Queue Full");
        return;
    }
    s->q[++(s->rear)]=item;
}

int Delete(Queue *s){
    if (s->front == s->rear){
        printf("Q Underflow");
        return(-1);
    }
    return (s->q[++s->front]);


}
void Display(Queue *q1){
    int i;
    for(i=q1->front+1;i<=q1->rear;i++)
       printf("%d\t",q1->q[i]);
}

int main(){
    Queue q1, *qptr;
    qptr = &q1;
    qptr->front = -1;
    qptr->rear = -1;
    Insert(qptr,10);
    Insert(qptr,20);
    Insert(qptr,30);
    Display(qptr);
    printf("\nFirst item Deleted = %d",Delete(qptr));
    printf("\nNext item Deleted = %d",Delete(qptr));
}
