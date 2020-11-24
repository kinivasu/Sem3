#include <stdio.h>
#include <stdlib.h>
#define true 1
#define false 0
typedef struct node *Nodeptr;

struct node{
    int data;
    Nodeptr rchild;
    Nodeptr lchild;
};

#include "QueueofNodeptr.h"
#include "StackofNodeptr.h"


Nodeptr getnode(){
    return ((Nodeptr)malloc(sizeof(struct node)));
}

Nodeptr CreateBinaryTree(int item){
    int x;

    if (item!=-1)
    {
        Nodeptr temp = getnode();
        temp->data = item;

        printf("Enter the lchild of %d :",item);
        scanf("%d",&x);
        //fflush(stdin);

        temp->lchild = CreateBinaryTree(x);
        printf("Enter the rchild of %d :",item);

        scanf("%d",&x);
        //fflush(stdin);

        temp->rchild = CreateBinaryTree(x);
        return temp;
    }
    return NULL;


}

void Inorder(Nodeptr root){
    if (root){
        Inorder(root->lchild);
        printf("%d\n",root->data);
        Inorder(root->rchild);
    }
}
void Preorder(Nodeptr root){
    static int count=0;
    count++;
    if (root){
        printf("%d %p ", count, root);
        printf("%d\n",root->data);
        Preorder(root->lchild);
        Preorder(root->rchild);
    }
    count--;

}
void Postorder(Nodeptr root){
    if (root){
        Postorder(root->lchild);
        Postorder(root->rchild);
        printf("%d ",root->data);

    }

}

void iterative_inorder(Nodeptr root)
{
    Nodeptr cur;
    int done = false;

    //STACK *s = (STACK *)(malloc(sizeof(STACK));
    STACK *s,s1;
    s= &s1;
    s->top = -1;
    if(root==NULL){
        printf("Empty Tree\n");
        return;
    }

    cur=root;
    while(!done)
    {
        while(cur!=NULL)
        {
            Push(s, cur);
            cur=cur->lchild;
        }
        if(!IsEmptyStack(s))
        {
            cur=Pop(s);
            printf("%d ",cur->data);
            cur=cur->rchild;
        }
        else
            done = true;
    }
}


//makes use of Queue
void Levelorder(Nodeptr root){

    QUEUE *q, q1;
    q = &q1;
    q->Front=-1;
    q->Rear =-1;
    if (root== NULL)
    {
        printf("\nEmpty Tree\n");
        return;
    }
    InsertQ(q,root);
    while(!IsEmpty(q)){
        Nodeptr temp= DeleteQ(q);
        printf("%d ", temp->data);
        if (temp->lchild) InsertQ(q,temp->lchild);
        if (temp->rchild) InsertQ(q,temp->rchild);

    }

}

void insert(Nodeptr root, char direction[], int ele)
{
    int i;
    Nodeptr temp,cur,parent;

    temp= getnode();
    temp->data=ele;
    temp->lchild=temp->rchild=NULL;

    parent = NULL;
    cur=root;
    i=0;
    while (cur && direction[i]) //traverse down the tree
    {
        parent = cur;
        if(direction[i]=='L' || direction[i]=='l')
            cur=cur->lchild;
        else
            cur=cur->rchild;
        i++;
    }
    if ((cur != NULL) || (direction[i]!='\0'))
    {
        /*node already present at specified position
        or incorrect direction string */
       printf("Insertion Not possible\n") ;
       free(temp);
       return;
    }
    /*Based on last character of direction string
    insert as a left or right child */
    if(direction[i-1]=='L' || direction[i-1]=='l')
            parent->lchild=temp;
    else
            parent->rchild=temp;
}


void Iterative_postorder(Nodeptr root)
{
    struct stack
    {
        Nodeptr node;
        int flag;
    };
    Nodeptr cur;
    struct stack s[20];
    int top=-1;
    if(root==NULL)
    {
        printf("Tree is empty");
        return;
    }
    cur=root;
    for(; ;){
        while(cur!=NULL){ //traverse left and push the nodes to the stack and set flag to 1
        s[++top].node=cur;
        s[top].flag = 1;
        cur=cur->lchild;
    }
    while(s[top].flag<0){ //if flag is –ve, right subtree is visited and hence node is popped and printed
        cur=s[top--].node;
        printf("%d ", cur->data);
        if(top==-1) //if stack is empty, traversal is complete
            return;
    }
    cur= s[top].node; //after left subtree is traversed, move to right and set its flag to -1 to
    //indicate right subtree is traversed*/
    cur=cur->rchild;
    s[top].flag = -1;
    }
}
int Search(Nodeptr root,int ele) //uses preorder traversal
{
    static int t=0;
    if(root)
    {
        if(root->data==ele){
            t++;
            return t;
        }
        if (t==0) Search(root->lchild,ele);
        if (t==0) Search(root->rchild,ele);
    }
}
int max(int a,int b)
{
    return (a>b)? a:b;
}
int height(Nodeptr root)
{
    int left,right;
    if(root==NULL)
        return 0;
    left=height(root->lchild);
    right=height(root->rchild);
    return 1+max(left,right);

}
int count_leafnodes( Nodeptr root)
{
	static int count = 0;
	if(root!=NULL){
		//if(root->lchild==NULL && root->rchild==NULL)
            ++count;
        count_leafnodes(root->lchild);

		count_leafnodes(root->rchild);
	}

	return count;
}

int main(){

    Nodeptr root = NULL;

    int item;
    char direction[50];

    printf("Creating the tree : \n");
    scanf("%d",&item);
    fflush(stdin);
    root=CreateBinaryTree(item);

    printf("\nInorder Traversal : \n");
    Inorder(root);
    printf("\nPreorder Traversal : \n");
    Preorder(root);
    printf("\nPostorder Traversal : \n");
    Iterative_postorder(root);


    printf("\nLevel Order Traversal : \n");
   Levelorder(root);

    printf("\nIterative  inOrder Traversal : \n");
    iterative_inorder(root);



    printf("\nHeight of the tree = %d\n",height(root));

    printf("Enter the item to be searched: ");

    scanf("%d", &item);
    int t = Search(root, item);
    if (t==1)
        printf("the element found\n");
    else
        printf("the element not found\n");
    printf("\n%d", count_leafnodes(root));
    printf("\nEnter the direction string for insertion : ");
    scanf(" %s", direction);
    printf("Enter the item to be inserted : ");
    scanf("%d",&item);
    insert(root, direction, item);
    Inorder(root);
    return 0;

}

