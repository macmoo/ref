/*
	２次元配列の要素数を表示
*/

#include  <stdio.h>

int main(void)
{
	int	 x[4][3];

	printf("配列xは%d×%dの２次元配列です。\n",
								(int)(sizeof(x)	   / sizeof(x[0])),
								(int)(sizeof(x[0]) / sizeof(x[0][0])));
	return (0);
}