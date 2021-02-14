#include <stdio.h>
#include <stdlib.h>
#define MAX 5

typedef struct{
	int a[MAX];
	int front,rear;
}APQ;

void check(APQ* apq,int data)
{
	int i,j;
	for (i = 0; i <= apq->rear; i++)
	{
		if (data <= apq->a[i])
		{
			for (j = apq->rear + 1; j > i; j--)
			{
				apq->a[j] = apq->a[j - 1];
			}
			apq->a[i] = data;
			return;
		}
	}
	apq->a[i] = data;
}

void pqinsert(APQ* apq,int data)
{
	if (apq->rear >= MAX - 1)
	{
		printf("\nQueue overflow no more elements can be inserted");
		return;
	}
	if ((apq->front == -1) && (apq->rear == -1))
	{
		apq->front++;
		apq->rear++;
		apq->a[apq->rear] = data;
		return;
	}
	else
		check(apq,data);
	apq->rear++;
}
void pqmindelete(APQ* apq)
{ 
	int i;
	if ((apq->front==-1) && (apq->rear==-1))
	{
		printf("\nQueue is empty no elements to delete");
		return;
	}
	for (i = 0; i < apq->rear; i++)
	{
		apq->a[i] = apq->a[i + 1];}
		apq->a[i] = -99;
		apq->rear--;
		if (apq->rear == -1)
			apq->front = -1;
		return;
	}


void pqdisplay(APQ* apq)
{
	if ((apq->front == -1) && (apq->rear == -1))
	{
		printf("\nQueue is empty");
		return;
	}
	for (; apq->front <= apq->rear; apq->front++)
	{
		printf(" %d ", apq->a[apq->front]);
	}
	apq->front = 0;
}
void main()
{
	APQ apq;
	apq.front=-1;
	apq.rear=-1;

	int n, ch,flag=1;
	while (flag)
	{
		printf("\n1 - Insert an element into queue");
		printf("\n2 - Delete an element from queue");
		printf("\n3 - Display queue elements");
		printf("\n4 - Exit");
		printf("\nEnter your choice : ");
		scanf("%d", &ch);
		switch (ch)
		{
			case 1:
			printf("\nEnter value to be inserted : ");
			scanf("%d",&n);
			pqinsert(&apq,n);
			break;
			case 2:
			pqmindelete(&apq);
			break;
			case 3:
			pqdisplay(&apq);
			break;
			case 4:
			flag=0;			
			default:
			printf("\nChoice is incorrect, Enter a correct choice");
		}
	}
	return ;
}