/*
	height行width列の２次元配列（もどき）を動的に確保
*/

#include  <stdio.h>
#include  <stdlib.h>

int main(void)
{
	int	 height, width;		/* 行数と列数 */
	int	 **p;

	printf("行数：");	scanf("%d", &height);
	printf("列数：");	scanf("%d", &width);

	p = (int **)calloc(height, sizeof(int *));

	if (p == NULL) 
		puts("記憶域の確保に失敗しました。");
	else {
		int	 i, j;

		for (i = 0; i < height; i++)
			p[i] = NULL;

		for (i = 0; i < height; i++) {
			p[i] = (int *)calloc(width, sizeof(int)); 
			if (p[i] == NULL) {
				puts("記憶域の確保に失敗しました。");
				goto Free;
			}
		}
		for (i = 0; i < height; i++)		/* 全要素に0を代入 */
			for (j = 0; j < width; j++)
				p[i][j] = 0;

		for (i = 0; i < height; i++)		/* 全要素の値を表示 */
			for (j = 0; j < width; j++)
				printf("p[%d][%d] = %d\n", i, j, p[i][j]);
Free:
		for (i = 0; i < height; i++)
			free(p[i]);
		free(p);
	}
	return (0);
}