/*
	デコボコ２次元配列を確保するプログラム
*/

#include  <stdio.h>
#include  <stdlib.h>

int main(void)
{
	int	 *x[4];

	x[0] = calloc(8 , sizeof(int));
	x[1] = calloc(5 , sizeof(int));
	x[2] = calloc(7 , sizeof(int));
	x[3] = calloc(6 , sizeof(int));

	/* 中略 */

	free(x[0]);
	free(x[1]);
	free(x[2]);
	free(x[3]);

	return (0);
}