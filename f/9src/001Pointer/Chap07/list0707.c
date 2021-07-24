/*
	int型の配列を動的に確保
*/

#include  <stdio.h>
#include  <stdlib.h>

int main(void)
{
	int	 no;		/* 配列の要素数 */
	int	 *p;

	printf("確保する配列の要素数：");
	scanf("%d", &no);

	p = (int *)calloc(no, sizeof(int));		/* 整数をno個動的に確保 */

	if (p == NULL)
		puts("記憶域の確保に失敗しました。");
	else {
		int	 i;

		for (i = 0; i < no; i++)			/* 全要素に添字と同じ値を代入 */
			p[i] = i;
		for (i = 0; i < no; i++)			/* 全要素の値を表示 */
			printf("p[%d] = %d\n", i, p[i]);

		free(p);							/* 確保していた領域を解放 */
	}

	return (0);
}