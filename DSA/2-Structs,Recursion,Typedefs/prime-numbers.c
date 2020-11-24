#include <stdio.h>

int prime(int n) {
     static int i = 2;
     if (n % i == 0 && n != 2)
     {
          return (0);
     }
     if (i < n)
     {
          i++;
          prime(n); // recursion call
     }
     return 1;
}

int main() {
     if (prime(7))
          printf("Prime");
     else
          printf("not");
}
