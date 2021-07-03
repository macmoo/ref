/*
	１次元配列へのポインタ
*/

#include  <stdio.h>

int main(void)
{
	int	 x[5];

	printf("sizeof(*&x)		= %u\n", (unsigned)sizeof(*&x));
	printf("sizeof(*&x[0])	= %u\n", (unsigned)sizeof(*&x[0]));

	return (0);
}