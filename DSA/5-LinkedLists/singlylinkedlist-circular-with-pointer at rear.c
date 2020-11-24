#include <stdio.h>
#include <stdlib.h>

//singly linked circular with pointer to last node
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

Nodeptr InsertFront(Nodeptr last, int x){
    Nodeptr temp;

    temp= getnode();
    temp->data = x;

    if (last == NULL){//list is empty
        last = temp;
        temp->next = temp;//circular list
    }
    else
    {
        temp->next = last->next;
        last->next = temp;
    }
    return last;
}
Nodeptr InsertLast(Nodeptr last, int x){
    Nodeptr temp;

    temp= getnode();
    temp->data = x;

    if (last == NULL){//list is empty
        last = temp;
        temp->next = temp;//circular list
    }
    else
    {
        temp->next = last->next;
        last->next = temp;
        last = temp;
    }
    return last;
}

void Display(Nodeptr last){
    Nodeptr temp=getnode();

    if (last == NULL)
    {
        printf("Empty List");
        return;
    }
    temp=last->next;
    printf("\nContents of List : \n");
    do{
        printf("%d\n",temp->data);
        temp = temp->next;
    }while (temp !=last->next);
    //printf("%d\n",temp->data);

}


/*

Nodeptr InsertAfter(Nodeptr first, int x, int y){

Nodeptr temp, prev;
//search for y
prev= first;
while(prev){
   if (prev->data == y)
       break;
    prev=prev->next;
}
if (prev==NULL){ //y not found
    printf("%d Not .. returning", y);
    return first;
}

//y is found, insert x

temp = getnode();
temp->data = x;
temp->next = NULL;

temp->next = prev->next;
prev->next = temp;

return first;
}

Nodeptr Reverse(Nodeptr first){
    Nodeptr p,q,r;
    p= first;
    q=NULL;

    while(p){
        r=q;
        q=p;
        p=p->next;
        q->next = r;
    }

    return q;

} */

int DeleteFront(Nodeptr *last){
    Nodeptr temp;
    int x;

    if (*last==NULL){
        printf("Empty List\n");
        return -999;//error
    }
    temp = (*last)->next;
    x = temp->data;
    if (temp == *last) //deleting the last remaining node
        *last = NULL;
    else
        (*last)->next = temp->next;
    free(temp);
    return x;
}

int DeleteLast(Nodeptr *last){
    Nodeptr temp, prev;
    int x;

    if (*last == NULL){
        printf("Empty List\n");
        return -999;
    }

    if ((*last)->next== *last) // single node
    {
        temp = *last;
        x = temp->data;
        free(temp);
        *last = NULL;
        return x;
    }
    prev = (*last)->next;
    while(prev->next!= *last)
        prev = prev->next;
    prev->next = (*last)->next;
    temp = *last;
    *last = prev;
    x = temp->data;
    free(temp);
    return x;

}
//try this
Nodeptr Delete(Nodeptr *last, int x){
    Nodeptr trail = NULL;
    Nodeptr temp = (*last)->next;

    while (temp && temp->data != x)
    {
        trail = temp;
        temp = temp->next;
    }

    if (temp == NULL){
        printf("%d Not found",x);
        return first;
    }
    if (trail == NULL){
        first = first->next;
    }
    else{
        trail->next = temp->next;
    }
    free(temp);
    return first;


}*/
int main()
{
    Nodeptr last = NULL; //list is empty


    last= InsertFront(last,20);

    last = InsertFront(last,10);

    Display(last);

    last = InsertLast(last,30);

    last = InsertLast(last,50);

    Display(last);
/*
    first = Reverse(first);

    //first = InsertAfter(first,40, 60 );

    Display(first);
    int x;
    x = DeleteFront(&first);
    //printf("\nItem deleted from front = %d",x);
    Display(first);
    x = DeleteLast(&first);
    printf("\nItem deleted from Last = %d",x);
    Display(first);
    first = Delete(first,30);
    Display(first);
*/
    return 0;
}

