/*
	文字列の配列を動的に生成
*/

#include  <stdio.h>
#include  <stdlib.h>

int main(void)
{
	int	  num;			/* 文字列の個数 */
	char  (*p)[15];		/* 文字数は定数15 */

	printf("文字列は何個：");
	scanf("%d", &num);

	p = (char (*)[15])malloc(num * 15);

	if (p == NULL) 
		puts("記憶域の確保に失敗しました。");
	else {
		int	 i;

		for (i = 0; i < num; i++) {			/* 文字列を読み込む */
			printf("p[%d] : ", i);
			scanf("%s", p[i]);
		}

		for (i = 0; i < num; i++)			/* 文字列を表示 */
			printf("p[%d] = %s\n", i, p[i]);

		free(p);							/* 記憶域を解放 */
	}

	return (0);
}