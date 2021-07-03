/*
	文字列を動的に生成
*/

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

int main(void)
{
	char  st[128];
	char  *pt;

	printf("文字列stを入力してください：");
	scanf("%s", st);

	pt = (char *)malloc(strlen(st) + 1);	/* 文字列を動的に生成 */

	if (pt) {
		strcpy(pt, st);
		printf("その文字列のクローンptを作りました。\n");
		printf("st = %s\n", st);
		printf("pt = %s\n", pt);
		free(pt);					/* 記憶域を解放 */
	}

	return (0);
}