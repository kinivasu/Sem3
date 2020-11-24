#include <stdio.h>
#include <stdlib.h>

//self referential structure
typedef struct node *Nodeptr;

struct node{
    int data;
    Nodeptr next;
};

Nodeptr getnode(){
    Nodeptr temp;

    temp = (Nodeptr) malloc(sizeof(struct node));
    if (temp==NULL){

        printf("No Memory Space");
        exit(0);
    }
    return temp;

}


void Display(Nodeptr front){
    Nodeptr temp;

    if (front == NULL){
        printf("Empty Queue");
        return;
    }
    temp=front;
    printf("\nContents of Queue : \n");
    while(temp){
        printf("%d\n",temp->data);
        temp = temp->next;
    }
}

void Insert(Nodeptr *rear, Nodeptr *front, int x){
    Nodeptr temp;

    temp= getnode();
    temp->data = x;
    temp->next = NULL;

    if (*rear==NULL){
        *front = temp;
        *rear = temp;
    }
    else{

        (*rear)->next = temp;
        *rear = temp;
    }
}

int Delete(Nodeptr *front, Nodeptr *rear){
    Nodeptr temp;
    int x;

    if (*front==NULL){
        printf("Queue Empty\n");
        return -999;//error
    }

    temp = *front;
    x = (*front)->data;
    *front = (*front)->next;
    if (*front == NULL)
        *rear = NULL;
    free(temp);
    return x;
}

int main()
{
    Nodeptr front = NULL; //list is empty
    Nodeptr rear = NULL;


    Insert(&rear, &front,10);

    Insert(&rear, &front,20);

    Insert(&rear, &front,30);

    Display(front);

    int x = Delete(&front, &rear);
    printf("\nItem deleted from front = %d",x);
    x = Delete(&front, &rear);
    printf("\nItem deleted from front = %d",x);
    x = Delete(&front, &rear);
    printf("\nItem deleted from front = %d",x);
    Display(front);

    return 0;
}

