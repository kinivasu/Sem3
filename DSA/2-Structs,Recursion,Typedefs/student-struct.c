#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct DOB{
    int  day;
    char *month;
    int year;
};
struct STU_INFO{
    char sname[15];
    int age;
};
struct COLLEGE{
    char cname[15];
    char address[20];
};
struct Student{
    struct DOB *d;
    struct STU_INFO s;
    struct COLLEGE c;
};

int main(){
    struct Student *s1;
    char str[50];
    s1 = (struct Student*)malloc(sizeof(struct Student));
    s1->d = (struct DOB *)malloc(sizeof(struct DOB));
    scanf("%d ", &s1->d->day);
    scanf("%s",str);
    s1->d->month = (char *)calloc(strlen(str)+1, sizeof(char));
    strcpy(s1->d->month,str);
    scanf("%d",&s1->d->year);
    printf("%d\n", s1->d->day);
    printf("%s\n",s1->d->month);
    printf("%d",s1->d->year);
}