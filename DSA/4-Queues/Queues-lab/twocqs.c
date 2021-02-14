#include <stdio.h>
#include <stdlib.h>

#define SIZE 10
#define UNDERFLOW_INT -32767

typedef enum {
    NO = 0,
    YES = 1,
} BOOL;

typedef struct{
    int * arr;
    int front1, rear1, cap1;//front,rear,capacity
    int front2, rear2, cap2;
} CQ;

typedef CQ * CQptr;

//qno is the parameter to decide which q is being called
BOOL isFull (CQ q, int qno) {
    if (qno == 1 && q.cap1 == SIZE/2)
        return YES;
    else if (qno == 2 && q.cap2 == SIZE/2)
        return YES;
    return NO;
}

BOOL isEmpty (CQ q, int qno) {
    if (qno == 1 && q.cap1 == 0)
        return YES;
    else if (qno == 2 && q.cap2 == 0)
        return YES;
    return NO;
}

void insert (CQptr q, int item, int qno) {
    if (isFull(*q, qno)) {
        printf("\nQUEUE '%d' OVERFLOW!", qno);
        return;
    }
    
    if (qno == 1) {
    
        if (isEmpty(*q, qno))
            q->front1 = q->rear1 = 0;
            
        else if (q->rear1 == SIZE/2 - 1)
            q->rear1 = 0;
            
        else
            q->rear1 += 1;
            
        *(q->arr + q->rear1) = item;
        q->cap1++;
    }
    
    if (qno == 2) {
    
        if (isEmpty(*q, qno))
            q->front2 = q->rear2 = SIZE - 1;
            
        else if (q->rear2 == SIZE/2)
            q->rear2 = SIZE - 1;
            
        else
            q->rear2 -= 1;
            
        *(q->arr + q->rear2) = item;
        q->cap2++;
    }
}

int delete (CQptr q, int qno) {
    if (isEmpty(*q, qno)) {
        printf("\n\t\tQUEUE '%d' UNDERFLOW!\n\n", qno);
        return UNDERFLOW_INT;
    }
    
    int item = 0;
    if (qno == 1) {
    
        item = *(q->arr + q->front1);
        *(q->arr + q->front1) = 0;
        
        if (q->front1 == q->rear1)
            q->front1 = q->rear1 = -1;
            
        else if (q->front1 == SIZE/2 - 1)
            q->front1 = 0;
            
        else
            q->front1 += 1;
            
        q->cap1--;
    }
    
    if (qno == 2) {
    
        item = *(q->arr + q->front2);
        *(q->arr + q->front2) = 0;
        
        if (q->front2 == q->rear2)
            q->front2 = q->rear2 = SIZE - 1;
            
        else if (q->front2 == SIZE/2)
            q->front2 = SIZE - 1;
            
        else
            q->front2 -= 1;
            
        q->cap2--;
    }
    return item;
}

void display (CQ q, int qno) {
    if (isEmpty(q, qno)) {
        printf("\tEMPTY q %d\n", qno);
        return;
    }
    
    printf("\tQUEUE '%d': ", qno);
    int i;
    
    if (qno == 1) {
        if (q.rear1 >= q.front1)
            for (i = q.front1; i <= q.rear1; ++i)
                printf("\t%d", *(q.arr + i));
                
        else {
            for (i = q.front1; i < SIZE/2; ++i)
                printf("\t%d", *(q.arr + i));
            for (i = 0; i <= q.rear1; ++i)
                printf("\t%d", *(q.arr + i));
        }       
    }
    
    else if (qno == 2) {
        if (q.rear2 <= q.front2)
            for (i = q.front2; i >= q.rear2; --i)
                printf("\t%d", *(q.arr + i));
                
        else {
            for (i = q.front2; i >= SIZE/2; --i)
                printf("\t%d", *(q.arr + i));
            for (i = SIZE - 1; i >= q.rear2; --i)
                printf("\t%d", *(q.arr + i));
        }
    }
    
    printf ("\n");
}


int main() {

    CQptr q = (CQptr)malloc(sizeof(CQ));
    q->arr = (int *)calloc(SIZE, sizeof(int));

    q->front1 = q->rear1 = -1;
    q->front2 = q->rear2 = SIZE;
    q->cap1 = q->cap2 = 0;
    
    int qno;
    do {
        printf("MAIN MENU\n  1. Queue 1.\n  2. Queue 2.\n  3. Display Both.\n  Anything else for exit.\n\n  Enter choice: ");
        scanf("%d", &qno);
        
        if (qno == 3) {
            display(*q, 1);
            display(*q, 2);
            continue;
        }
        else if (!(qno == 1 || qno == 2))
            exit(6);
            
        printf("\n\t| You have choosen Queue '%d'.\n", qno);
        char choice;
        
        do {
            printf("\n\t| 1. Insert.\n\t| 2. Delete.\n\t| 3. Display.\n\t| Anything else to go back.\n\t| Enter choice: ");
            scanf(" %c", &choice);
            
            if (choice == '1') {
                int item;
                printf("\n\t| Enter item to insert: ");
                scanf("%d", &item);
                insert(q, item, qno);
            }
            
            else if (choice == '2') {
                int item = delete(q, qno);
                if (item != UNDERFLOW_INT)
                    printf("\n\t| Deleted Item = %d.\n", item);
            }
            
            display(*q, qno);
        
        } while (choice == '1' || choice == '2' || choice == '3');
    
    } while (qno == 1 || qno == 2 || qno == 3);
    
}