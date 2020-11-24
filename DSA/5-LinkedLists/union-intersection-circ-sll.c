#include <stdio.h>
#include <stdlib.h>

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

void Display(Nodeptr first){
    Nodeptr temp;

    if (first)
    {
            printf("Contents of Set : \n");
            printf("%d\n",first->data);

            temp=first->next;
            while(temp!=first){
                printf("%d\n",temp->data);
                temp = temp->next;
            }
    }
}
Nodeptr InsertLast(int x, Nodeptr last){
    Nodeptr temp;

    temp= getnode();
    temp->data = x;
    //temp->next = NULL;

    last->next = temp;
    last = temp;

    return last;
}
//Search for given item in the circular list pointed first
int IsMember(int item, Nodeptr first){
    Nodeptr temp;

    if (first == NULL) {printf("List is Empty\n");return 0;}

    if (first->data == item)
        return 1;

    temp=first->next;
    while(temp!= first){
        if (temp->data==item)
               return 1;

        temp=temp->next;
    }

   return 0 ;
}

Nodeptr Create(){ //Create a circular singly linked list
    int item;
    Nodeptr first, last,temp;

    first = getnode(); //dummy node to make the insertion easier
    last = first;

    printf("Enter the number to be inserted: [-99 to end] ");
    scanf("%d",&item);
    while(item!=-99)
    {
        last=InsertLast(item, last);
        printf("Enter the number to be inserted: [-99 to end] ");
        scanf("%d",&item);

    }

    temp = first;
    first= first->next;
    last->next = first;
    free(temp); //delete dummy node

    return first;
}

Nodeptr Union(Nodeptr a, Nodeptr b){

    Nodeptr first, last;;

    //dummy node
    first = getnode();
    last = first;

    //Insert the elements of first set into new set

    last = InsertLast(a->data, last);

    Nodeptr temp= a->next;

    while (temp!=a)
    {
        last = InsertLast(temp->data, last);
        temp=temp->next;
    }
    //Insert elements of b which are not present in a
    if (!IsMember(b->data, a))
        last = InsertLast(b->data, last);

    temp= b->next;
    while(temp!=b){
        if (!IsMember(temp->data, a))
            last=InsertLast(temp->data, last);
        temp=temp->next;
    }

    temp = first;
    first = first->next;
    free(temp); //delete dummy node
    last->next = first;

    return first;

}
Nodeptr Intersection(Nodeptr a, Nodeptr b){
    Nodeptr first, last;;

    first = getnode();//dummy node
    last = first;


    if (IsMember(a->data, b))
            last=InsertLast(a->data,last);
    Nodeptr temp= a->next;

    while (temp!=a)
    {
        if (IsMember(temp->data, b))
            last=InsertLast(temp->data,last);
        temp=temp->next;
    }

    temp = first;
    first = first->next;
    free(temp); //delete dummy node
    last->next = first;

    return first;

}
int main(){
    Nodeptr a,b,c,d;
    printf("Circular Singly Linked List ....\n");
    printf("Creating first list : \n");
    a = Create();

    Display(a);
    printf("Creating second list : \n");

    b=Create();

    Display(b);


    c = Union(a,b);
    printf("Forming Union of 2 lists \n");
    Display(c);

    d = Intersection(a,b);
    printf("Forming Intersection of 2 lists \n");
    Display(d);
    return 0;

}
