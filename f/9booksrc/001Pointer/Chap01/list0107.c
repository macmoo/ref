/*
	int型の有効ビット数を表示
*/

#include  <stdio.h>

/*--- int型／unsigned int型のビット数を返す ---*/
int int_bits(void)
{
	int		  count = 0;
	unsigned  x = ~0U;

	while (x) {
		if (x & 1U) count++;
		x >>= 1;
	}
	return (count);
}

int main(void)
{
	printf("int型の有効ビットは%dビットです。\n", int_bits());

	return (0);
}
