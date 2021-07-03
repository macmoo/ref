/*
	２次元配列の配列名aが&a[0]であり&a[0][0]でないことを確認
*/

#include  <stdio.h>

int main(void)
{
	int	 a[2][3];

	printf("sizeof(*a)		= %u\n", (unsigned)sizeof(*a));
	printf("sizeof(a[0])	= %u\n", (unsigned)sizeof(a[0]));
	printf("sizeof(a[0][0])	= %u\n", (unsigned)sizeof(a[0][0]));

	return (0);
}