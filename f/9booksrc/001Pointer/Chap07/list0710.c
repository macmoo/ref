/*
	height行3列の２次元配列を確保
*/

#include  <stdio.h>
#include  <stdlib.h>

int main(void)
{
	int	 height;		/* 行数 */
	int	 (*p)[3];		/* 列数は定数（ここでは3） */

	printf("行数：");
	scanf("%d", &height);

	p = (int (*)[3])calloc(height * 3, sizeof(int));

	if (p == NULL)
		puts("記憶域の確保に失敗しました。");
	else {
		int	 i, j;

		for (i = 0; i < height; i++)		/* 全要素に0を代入 */
			for (j = 0; j < 3; j++)
				p[i][j] = 0;

		for (i = 0; i < height; i++)		/* 全要素の値を表示 */
			for (j = 0; j < 3; j++)
				printf("p[%d][%d] = %d\n", i, j, p[i][j]);

		free(p);
	}

	return (0);
}