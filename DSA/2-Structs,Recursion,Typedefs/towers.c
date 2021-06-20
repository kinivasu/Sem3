#include <stdio.h>

int tower(int n, char source, char temp, char destination)
{
	static int Count = 0;
	if (n == 1)
	{
		Count++;
		printf("move disk 1 from %c to %c\n", source, destination);
		return Count;
	}

	/*moving n-1 disks from A to B using C as auxiliary*/
	tower(n - 1, source, destination, temp);
	Count++;
	printf("move disk %d from %c to %c\n", n, source, destination);

	/*moving n-1 disks from B to C using A as auxiliary*/
	tower(n - 1, temp, source, destination);
}

int main()
{

	// Source, Temp(Auxillary), Destination
	int x = tower(4, 'A', 'B', 'C');
	printf("No. of moves = %d", x);
}
