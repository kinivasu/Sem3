#include<stdio.h>
void rfn(int n) 
{ 
    if (n!=1) 
   { 
      rfn(n-1); 
     printf("%d recursing",n);
  } 
}
int main(){
    rfn(4);
}