#include <stdio.h>
#include <string.h>
#define MAX_SIZE 10 // Max No. of Strings
#define MAX_STR 20  // Max Length of strings

typedef struct
{
    char **arr;
    int front, rear;
} CQ;

void init(CQ *cq)
{
    int i;
    cq->front = -1;
    cq->rear = -1;
    cq->arr = malloc(sizeof(char *) * MAX_SIZE);
    for (i = 0; i < MAX_SIZE; i++)
        cq->arr[i] = malloc(sizeof(char *) * MAX_STR);
}

void insertq(CQ *cq, char *str)
{
}