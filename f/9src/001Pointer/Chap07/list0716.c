/*
	文字列の配列を動的に生成
*/

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

int main(void)
{
	int	  num;			/* 文字列の個数 */
	char  **pt;

	printf("文字列は何個：");
	scanf("%d", &num);

	pt = (char **)calloc(num, sizeof(char *));

	if (pt == NULL) 
		puts("記憶域の確保に失敗しました。");
	else {
		int	 i;

		for (i = 0; i < num; i++)
			pt[i] = NULL;

		for (i = 0; i < num; i++) {
			char  temp[128];

			printf("p[%d] : ", i);
			scanf("%s", temp);

			pt[i] = (char *)malloc(strlen(temp) + 1);

			if (pt[i] == NULL) {
				puts("記憶域の確保に失敗しました。");
 				goto Free;
			} else 
				strcpy(pt[i], temp);
		}
		for (i = 0; i < num; i++)
			printf("pt[%d] = %s\n", i, pt[i]);
Free:
		for (i = 0; i < num; i++)
			free(pt[i]);					/* 記憶域を解放 */
		free(pt);
	}
	return (0);
}