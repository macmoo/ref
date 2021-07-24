/* 演習3-2の解答例 */

#include  <stdio.h>

int main(void)
{
	int	 x[3][2][4];

	printf("配列xは%d×%d×%dの３次元配列です。\n",
				(int)(sizeof(x)		  / sizeof(int[2][4])),
				(int)(sizeof(x[0])	  / sizeof(int[4])),
				(int)(sizeof(x[0][0]) / sizeof(int)));

	return (0);
}
