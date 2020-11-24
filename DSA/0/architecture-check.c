/* 
   Write a C program to find out if the underlying 
   architecture is little endian or big endian. 
 */
 
#include <stdio.h>
int main ()
{
  unsigned int x = 0x76543210;
  char *c = (char*) &x;
 
  printf ("*c is: 0x%x\n", *c);
  if (*c == 0x10)
  {
    printf ("Underlying architecture is little endian. \n");
  }
  else
  {
     printf ("Underlying architecture is big endian. \n");
  }
 
  return 0;
}


//? Check this website for more reference
//* https://cs-fundamentals.com/tech-interview/c/c-program-to-check-little-and-big-endian-architecture#:~:text=Big%20endian%20and%20little%20endian,and%20host%20byte%20order%20respectively.