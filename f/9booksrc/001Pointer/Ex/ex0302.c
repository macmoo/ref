/* 演習3-2の解答例 */

#include  <stdio.h>

int main(void)
{
	int	 x[3][2][4];

	printf("配列xは%d×%d×%dの３次元配列です。\n",
				(int)(sizeof(x)       / sizeof(x[0])),
				(int)(sizeof(x[0])    / sizeof(x[0][0])),
				(int)(sizeof(x[0][0]) / sizeof(x[0][0][0])));

	return (0);
}
