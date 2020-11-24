#include<stdio.h>
#include<stdlib.h>

typedef int* INTPOINTER;

enum days {MON, TUE, WED,THU,FRI, SAT,SUN};
enum {OFF, ON};
enum {space=' ', comma = ',',newline='\n'};
int main(){

    INTPOINTER p1, p2;
    int r=10, c=20;
    p1 = &r;
    p2 = &c;
    printf("%d %d\n",*p1, *p2);

    enum days yesterday, tomorrow;
    yesterday = 8;
    tomorrow = THU;
    printf("%d %d",yesterday, tomorrow);
    printf("%c",newline);
    printf("Hello");
    return 0;
}