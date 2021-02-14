#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define MAXSIZE 20 // Max number of Strings
#define MAXSTR 30  // Max Length of strings

typedef struct{
	char **a;
	int front, rear;
}CQ;

void createcq(CQ* cq){
	//printf("Create function called\n");
	int i;
	cq->front=-1;
	cq->rear=-1;
	cq->a=malloc(sizeof(char*)*MAXSIZE);
	for(i=0;i<MAXSIZE;i++){
		cq->a[i]=malloc(sizeof(char)*MAXSTR);
	}
	//printf("Create function finished\n");
}

void insertcq(CQ* cq, char* str){
	//if CQ is empty
	if(cq->front==cq->rear && cq->rear==-1){
		cq->front=cq->rear=0;
		strcpy(cq->a[cq->rear],str);
		return;
	}

	//if CQ is full
	if(cq->front == (cq->rear +1)%MAXSIZE){
		printf("Queue is full\n");
		return;
	}

	//all other cases
	cq->rear = (cq->rear +1)%MAXSIZE;
	strcpy(cq->a[cq->rear], str);
}

void deletecq(CQ* cq){
	//if CQ is empty
	if(cq->front==cq->rear && cq->rear==-1){
		printf("Queue is Empty!!\n");
		return;
	}
	cq->front=(cq->front+1)%MAXSIZE;
	//return cq->a[cq->front];
	return;
}

void displaycq(CQ* cq){
	int i;
	if(cq->front==cq->rear && cq->rear==-1){
		printf("Queue Empty");
		return;
	}
	printf("The Queue is:     ");
	for(i=cq->front;i<cq->rear;i=(i+1)%MAXSIZE){
		printf("%s ",cq->a[i]);
	}
	printf("%s\n",cq->a[i]);
}

int main(){

	CQ cq;
	createcq(&cq);

	int ch, flag = 1;
	char* x=malloc(sizeof(char) * MAXSTR);
    do
    {
        printf("1. Insert Queue\n2. Delete Queue\n3. Display Queue\n4. Exit\n");
        printf("Enter your choice: ");

        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            printf("\nEnter the String:");
            scanf("%s", x);
            //puts(x);
            insertcq(&cq, x);
            break;
        case 2:
            deletecq(&cq);
            printf("\nFront String Removed from the Queue\n");
            break;
        case 3:
            displaycq(&cq);
            break;
        case 4:
        	printf("Exiting...\n");
            flag = 0;
            break;
        default:
            printf("\nWrong choice!!! Try Again.\n");
        }
    }while(flag);
    return 0;
}