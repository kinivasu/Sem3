#include<stdio.h>
#define Maxsize 15
typedef struct
{
 int Q[100];
 int Front,Rear;
 }PQ;
void InsertPQ(PQ *q1, int item)
{
    int i,j;
    if (q1->Rear==Maxsize-1)
    { printf("Q Full");return;}
    for(i=q1->Front+1; i<=q1->Rear;i++)
        if (q1->Q[i]>item) break;
        if (i<=q1->Rear) {//Check whether insertion is at the middle position of Queue
        for(j=q1->Rear;j>=i;j--)
           q1->Q[j+1]=q1->Q[j];
    }
     q1->Q[i]=item;
     q1->Rear++;

}

int DeletePQ(PQ *q1){
  if (q1->Front==q1->Rear){printf("Q Empty");return -1;}
  return q1->Q[++q1->Front];
}

void Display(PQ *q1){
    for(int i=q1->Front+1;i<=q1->Rear;i++)
       printf("%d\t",q1->Q[i]);
}
int main()
{
    PQ q;
    int x;
    q.Front=-1;q.Rear=-1;
    int choice,item,i;

    do
    {
  printf("Enter 1: insert [-1 is invalid]\n2:Delete\n3:Display\n");
    scanf("%d",&choice);
    switch(choice)
    {
    case 1:
            printf("Enter element : ");
            scanf("%d",&item);
            InsertPQ(&q,item);
            break;
case 2: x=DeletePQ(&q);
        if (x==-1)
            printf("Q Empty");
        else
            printf("The element deleted is: %d\t",x);
        break;
case 3:printf("The elements of the Queue are:\n");
       Display(&q);
       break;
}

  }while(choice<4);
}
