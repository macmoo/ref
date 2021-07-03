/*
	整数１個分の記憶域を動的に確保（使い終わったら解放）
*/

#include  <stdio.h>
#include  <stdlib.h>

int main(void)
{
	int	 *p;

	p = (int *)calloc(1, sizeof(int));		/* 整数を１個動的に確保 */

	if (p == NULL)
		puts("記憶域の確保に失敗しました。");
	else {
		*p = 15;
		printf("*p = %d\n", *p);
		free(p);							/* 確保していた領域を解放 */
	}

	return (0);
}