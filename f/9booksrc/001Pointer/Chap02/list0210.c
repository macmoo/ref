/*
	配列の要素数を表示
*/

#include  <stdio.h>

int main(void)
{
	int	 x[5];

	printf("xの要素数は%uです。\n", (unsigned)(sizeof(x) / sizeof(x[0])));

	return (0);
}