#include <stdio.h>
#include<stdlib.h>

typedef struct node *Nodeptr;
struct node{
   int data;
   Nodeptr llink, rlink;
};
Nodeptr getnode(){
    Nodeptr temp;

    temp= (Nodeptr) malloc(sizeof(struct node));
    return temp;

}
Nodeptr InsertLast(int item, Nodeptr head){
    Nodeptr temp,last;

    temp = getnode();
    temp->data = item;

    last = head->llink;//last node

    temp->rlink = head;
    head->llink = temp;

    temp->llink = last;
    last->rlink = temp;

}

void InsertFront(int item, Nodeptr head){
    Nodeptr temp,next;

    temp = getnode();
    temp->data = item;

    next = head->rlink;

    temp->llink = head;
    head->rlink = temp;

    temp->rlink = next;
    next->llink = temp;

}

int DeleteFront(Nodeptr *head){
    Nodeptr temp, next;
    int x;

    if((*head)->rlink== *head){
        printf("Empty List");
        return -1;
    }

    temp= (*head)->rlink;
    x= temp->data;

    next = temp->rlink;
    next->llink = *head;
    (*head)->rlink = next;

    free(temp);
    return x;
}
int DeleteRear(Nodeptr *head){
    Nodeptr temp, prev;
    int x;

    if((*head)->rlink == *head){
        printf("Empty List");
        return -1;
    }

    temp = (*head)->llink;
    x = temp->data;

    prev = temp->llink;
    prev->rlink = *head;
    (*head)->llink = prev;

    free(temp);
    return x;


}
void Display(Nodeptr head){
    Nodeptr temp;
    for(temp=head->rlink; temp!=head;temp=temp->rlink)
        printf("%d ", temp->data);
}
int main()
{

    Nodeptr head;
    int item;

    //header node
    head=getnode();
    head->rlink = head;
    head->llink = head;

    InsertFront(30,head);
    InsertFront(20,head);
    InsertFront(10,head);
    InsertLast(40,head);
    InsertLast(50,head);
    InsertLast(60,head);
    printf("List contents : \n");

    Display(head);

    item=DeleteFront(&head);
    printf("\nItem Deleted = %d \n", item);
    item=DeleteFront(&head);
    printf("\nItem Deleted = %d \n", item);
    printf("List contents : \n");
    Display(head);

    item=DeleteRear(&head);
    printf("\nItem Deleted = %d \n", item);
    item=DeleteRear(&head);
    printf("\nItem Deleted = %d \n", item);
    printf("List contents : \n");
    Display(head);

    return 0;

}
