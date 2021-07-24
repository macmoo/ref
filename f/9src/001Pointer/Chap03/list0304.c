/*
	２次元配列を誤って宣言
*/

#include  <stdio.h>

int main(void)
{
	int	 i, j;
	int	 ma[2, 3];		/* ？ */

	for (i = 0; i < 2; i++)
		for (j = 0; j < 3; j++)
			printf("ma[%d][%d] = %d\n", i, j, ma[i][j]);

	return (0);
}