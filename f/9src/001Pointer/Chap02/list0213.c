/*
	配列の先頭三つの要素を合計
*/

#include  <stdio.h>

/*--- 配列の先頭三つの要素の合計を返す ---*/
int sum123(const int *a)
{
	return (a[0] + a[1] + a[2]);
}

int main(void)
{
	int	 x[5] = {1, 3, 5, 7, 9};	/* 要素型がint型で要素数が5の配列 */

	printf("x[0] + x[1] + x[2] = %d\n", sum123(x));

	return (0);
}