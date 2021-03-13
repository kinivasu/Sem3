#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Node *Nodeptr;

typedef struct Node
{
	int data;
	Nodeptr rlink;
	Nodeptr llink;
} Node;

Nodeptr createNode()
{
	Nodeptr temp = (Nodeptr)malloc(sizeof(Node));
	return temp;
}
void insert(Nodeptr *n, int val)
{
	if (*n == NULL)
	{
		*n = createNode();
		(*n)->data = val;
		(*n)->llink = (*n)->rlink = *n;
	}
	else
	{
		Nodeptr temp = *n;
		while (temp->llink != *n)
			temp = temp->llink;
		Nodeptr newNode = createNode();
		newNode->data = val;
		temp->llink = newNode;
		newNode->rlink = temp;
		newNode->llink = *n;
		(*n)->rlink = newNode;
	}
}

Nodeptr inputValue()
{

	Nodeptr head;
	char str[100];
	int i;
	printf("Enter a long value: ");
	scanf("%s", str);
	Nodeptr n = createNode();
	n->llink = n->rlink = n;
	for (i = 0; str[i]; i++)
		insert(&n, str[i] - '0');
	return n;
}

Nodeptr calcSum(Nodeptr A, Nodeptr B)
{

	int digit, sum, carry = 0;
	Nodeptr head, r, R, a, b;
	a = A->rlink;
	b = B->rlink;
	head = createNode();
	head->llink = head->rlink = head;
	while (a != A && b != B)
	{
		sum = a->data + b->data + carry;
		digit = sum % 10;
		carry = sum / 10;
		insert(&head, digit);
		a = a->rlink;
		b = b->rlink;
	}
	if (a != A)
	{
		r = a;
		R = A;
	}
	else
	{
		r = b;
		R = B;
	}
	while (r != R)
	{
		sum = r->data + carry;
		digit = sum % 10;
		carry = sum / 10;
		insert(&head, digit);
		r = r->rlink;
	}
	if (carry)
		insert(&head, carry);
	return head;
}

void display(Nodeptr *n)
{
	for (Nodeptr temp = (*n)->rlink; temp != *n; temp = temp->rlink)
		printf("%d", temp->data);
	printf("\n");
}

int main()
{
	Nodeptr A, B, sum;
	A = inputValue();
	B = inputValue();
	sum = calcSum(A, B);
	printf("Sum : ");
	display(&sum);
	return 0;
}