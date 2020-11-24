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

Nodeptr InsertFront(Nodeptr first, int x){
    Nodeptr temp;

    temp= getnode();
    temp->data = x;
    temp->next = NULL;

    if (first == NULL)//list is empty
        first = temp;

    else
    {
        temp->next = first;
        first = temp;
    }
    return first;
}

void Display(Nodeptr first){
    Nodeptr temp=getnode();

    temp=first;
    printf("\nContents of List : \n");
    while(temp){
        printf("%d\n",temp->data);
        temp = temp->next;
    }
}

void InsertLast(Nodeptr *first, int x){
    Nodeptr temp, rear;

    temp= getnode();
    temp->data = x;
    temp->next = NULL;

    if (*first==NULL){
        *first =temp;
    }
    else{
        rear = *first;
        while(rear->next)
            rear = rear->next;
        rear->next = temp;
    }
    //return first;
}

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

}
int DeleteFront(Nodeptr *first){
    Nodeptr temp;
    int x;

    if (*first==NULL){
        printf("Empty List\n");
        return -999;//error
    }

    temp = *first;
    x = temp->data;
    *first = (*first)->next;
    free(temp);
    return x;
//return first;
}

int DeleteLast(Nodeptr *first){
    Nodeptr temp, prev;
    int x;

    if (*first == NULL){
        printf("Empty List\n");
        return -999;
    }

    temp = *first;
    prev = NULL;
    while(temp->next){
        prev = temp;
        temp = temp->next;
    }
    if (prev == NULL )
        *first = NULL;
    else
        prev->next = NULL;

    x = temp->data;
    free(temp);
    return x;

}
Nodeptr Delete(Nodeptr first, int x){
    Nodeptr trail = NULL;
    Nodeptr temp = first;

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


}
int main()
{
    Nodeptr first = NULL; //list is empty


    first= InsertFront(first,20);

    first= InsertFront(first,10);

    Display(first);

    InsertLast(&first,30);

    InsertLast(&first,50);

    Display(first);

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

    return 0;
}

