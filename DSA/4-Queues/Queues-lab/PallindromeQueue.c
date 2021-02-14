#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 30
typedef struct DQ
{
	char data[MAX];
	int rear,front;
}DQ;


int empty(DQ *Q)
{
	if(Q->rear==-1)
		return(1);
	return(0);}
	int full(DQ *Q)
	{
		if((Q->rear+1)%MAX==Q->front)
			return(1);
		return(0);
	}
	void enqueueR(DQ *Q,char x)
	{
		if(empty(Q))
		{
			Q->rear=0;
			Q->front=0;
			Q->data[0]=x;
		}
		else
		{
			Q->rear=(Q->rear+1)%MAX;
			Q->data[Q->rear]=x;
		}
	}
	void enqueueF(DQ *Q,char x)
	{
		if(empty(Q))
		{
			Q->rear=0;
			Q->front=0;
			Q->data[0]=x;
		}else{
			Q->front=(Q->front-1+MAX)%MAX;
			Q->data[Q->front]=x;
		}
	}
	char dequeueF(DQ *Q)
	{
		char x;
		x=Q->data[Q->front];
		if(Q->rear==Q->front){
			Q->rear=-1;Q->front=-1;
		}
		else
			Q->front=(Q->front+1)%MAX;
		return(x);
	}
	char dequeueR(DQ *Q)
	{
		char x;
		x=Q->data[Q->rear];
		if(Q->rear==Q->front){
			Q->rear=-1;Q->front=-1;
		}
		else
			Q->rear=(Q->rear-1+MAX)%MAX;
		return(x);
	}
	void print(DQ *Q)
	{
		if(empty(Q))
		{
			printf("\nQueue is empty!!");exit(0);
		}
		int i;
		i=Q->front;
		while(i!=Q->rear)
		{
			printf("\n%c",Q->data[i]);
			i=(i+1)%MAX;
		}
		printf("\n%c\n",Q->data[Q->rear]);
	}
	int main()
	{
		int i,x,n;
		int op=0;
		char c[20];

		DQ Q;
		Q.rear=-1;
		Q.front=-1;

		printf("Enter string to check for Palindrome:  ");
		scanf("%s",c);
		n= strlen(c);
		for(i=0;i<n;i++)
		{
			enqueueF(&Q,c[i]);
		}
		for(i=0;i<n/2;i++)
		{
			if(dequeueF(&Q)!=dequeueR(&Q))
			{
				op = 1;
				break;
			}
		}
		if(op == 0)
			printf("%s is Palindrome\n",c);
		else
			printf("%s is not a Palindrome\n",c);
		return 0;
	}