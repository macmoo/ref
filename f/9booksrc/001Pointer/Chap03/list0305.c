/*
	２次元配列と要素の大きさを表示
*/

#include  <stdio.h>

int main(void)
{
	int	 x[4][3];

	printf("sizeof(x)       = %u\n", (unsigned)sizeof(x));
	printf("sizeof(x[0])    = %u\n", (unsigned)sizeof(x[0]));
	printf("sizeof(x[0][0]) = %u\n", (unsigned)sizeof(x[0][0]));

	return (0);
}