#include <stdio.h>
#include <stdlib.h>

typedef struct
{
	int data;
	struct Node *next;
} Node;

Node *rear = NULL;
Node *front = NULL;

Node *newNode(int item)
{
	Node *node = (Node *)malloc(sizeof(Node));

	if (node != NULL)
	{
		node->data = item;
		node->next = NULL;
		return node;
	}
	else
	{
		printf("\nHeap Overflow");
		exit(EXIT_FAILURE);
	}
}

int dequeue()
{

	if (front == NULL)
	{
		printf("\nQueue Underflow");
		exit(EXIT_FAILURE);
	}

	Node *temp = front;
	printf("Removing %d\n", temp->data);
	front = front->next;
	{
		rear = NULL;
	}

	int item = temp->data;
	free(temp);
	return item;
}

void enqueue(int item)
{

	Node *node = newNode(item);
	printf("Inserting %d\n", item);

	if (front == NULL)
	{
		front = node;
		rear = node;
	}
	else
	{
		rear->next = node;
		rear = node;
	}
}

int peek()
{
	if (front != NULL)
	{
		return front->data;
	}
	else
	{
		exit(EXIT_FAILURE);
	}
}

int isEmpty()
{
	return rear == NULL && front == NULL;
}

int main()
{
	enqueue(100);
	enqueue(25);
	enqueue(33);
	enqueue(98);
	printf("The front element is %d\n", peek());
	dequeue();
	dequeue();
	dequeue();
	dequeue();
	if (isEmpty())
	{
		printf("The queue is empty\n");
	}
	else
	{
		printf("The queue is not empty\n");
	}
	return 0;
}