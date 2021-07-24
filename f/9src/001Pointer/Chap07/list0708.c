/*
	確保した領域の大きさを変更（悪い例）
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
		int	 i, n2;

		for (i = 0; i < no; i++)			/* 全要素に添字と同じ値を代入 */
			p[i] = i;

		printf("要素数をいくつに変更しますか：");
		scanf("%d", &n2);

		p = (int *)realloc(p, n2 * sizeof(int));	/* 要素数をn2に変更 */

		for (i = no; i < n2; i++)		/* 増えた要素に添字と同じ値を代入 */
			p[i] = i;

		for (i = 0; i < n2; i++)			/* 全要素の値を表示 */
			printf("p[%d] = %d\n", i, p[i]);

		free(p);							/* 確保していた領域を解放 */
	}
	return (0);
}