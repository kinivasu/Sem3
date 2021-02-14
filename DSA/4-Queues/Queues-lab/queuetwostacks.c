#include<stdio.h> 
#include<stdlib.h> 
#define MAXSIZE 5 
typedef struct { 
	int arr[MAXSIZE];
	 int top; 
}Stack;

int isEmpty(Stack *s) {
 if(s->top==-1) 
 	return 1; 
 return 0; 
}
void enqueue(Stack *s,int ch) { 
	if((s->top+1)<MAXSIZE) 
		s->arr[++(s->top)]=ch; 
	else printf("Overflow!\n");
} 
int dequeue(Stack *s) {
 if(isEmpty(s)) 
 	return -9999; 
 return s->arr[(s->top)--]; 
} 

void display(Stack *s){
	if(s->top==-1){
		printf("Queue Empty");
	}
	else{
		printf("The Queue is:  ");
		for(int i=0;i<=s->top;i++){
			printf("%d ",s->arr[i]);
		}
	}
}
int main() { 
	Stack s1, s2;
	s1.top=s2.top=-1;
	int ch,n; int i=0;
	while (1){
	    printf("\n1. enqueue\n2. dequeue\n3. Display Queue\n4. Exit\nEnter:");
	    scanf("%d",&ch); 
	    switch(ch){   
	      	case 1 :
	      		printf("Enter the element you want to enqueue : ");
	      		scanf("%d",&n);
	      	  	enqueue(&s1,n);
	      	  	break;
	      	case 2 : 
	      		if(isEmpty(&s2)) {   
					while(!isEmpty(&s1)){ 
						enqueue(&s2,dequeue(&s1));
					} 
					n=dequeue(&s2);
					if( n!=-9999) 
						printf("Popped : %d\n",n);
					else
						printf("Underflow\n"); 
				} 
				else{ 
					n=dequeue(&s2);
					if(n!=-9999) 
						printf("Popped : %d\n",n); 
					else    
						printf("Underflow\n"); 
				}
				break;
			case 3:
				display(&s1);
				break;
			case 4:
				exit(0);
		} 
	}
	return 0; 
}