#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct{
	int data;
	struct Node *next;
}Node;

void push (Node **head_ref, int new_data);
bool isPresent (Node *head, int data);

Node * getIntersection (Node *head1, Node *head2)
{
	Node *result = NULL;
	Node *t1 = head1;
	while (t1 != NULL)
	{
		if (isPresent (head2, t1->data))
			push (&result, t1->data);
		t1 = t1->next;
	}
	return result;
}

Node * getUnion (Node *head1, Node *head2)
{
	Node *result = NULL;
	Node *t1 = head1, *t2 = head2;
	while (t1 != NULL)
	{
		push (&result, t1->data);
		t1 = t1->next;
	}
	while (t2 != NULL)
	{
		if (!isPresent (result, t2->data))
			push (&result, t2->data);
		t2 = t2->next;
	}
	return result;
}

void push (Node **head_ref, int new_data)
{
	Node *new_node = (Node *) malloc (sizeof (Node));
	new_node->data = new_data;
	new_node->next = (*head_ref);
	(*head_ref) = new_node;
}
void printList (Node *node)
{
	while (node != NULL)
	{
		printf ("%d ", node->data);
		node = node->next;
	}
}
bool isPresent (Node *head, int data)
{
	Node *t = head;
	while (t != NULL)
	{
		if (t->data == data)return 1;
		t = t->next;
	}
	return 0;
}
int main ()
{
	Node *head1 = NULL;
	Node *head2 = NULL;
	Node *uni = NULL;
	Node *inter = NULL;

	push (&head1, 100);
	push (&head1, 200);
	push (&head1, 300);
	push (&head1, 400);
	push (&head2, 200);
	push (&head2, 400);
	push (&head2, 600);
	push (&head2, 800);

	uni = getUnion (head1, head2);
	inter = getIntersection (head1, head2);

	printf ("\nFirst Set :  ");
	printList (head1);
	printf ("\nSecond Set :  ");
	printList (head2);
	printf ("\nIntersection Set :  ");
	printList (inter);
	printf ("\nUnion Set :  ");
	printList (uni);
	printf("\n");
	return 0;
}