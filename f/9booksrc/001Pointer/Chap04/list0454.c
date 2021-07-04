/*
	strpbrk関数の利用例（その２）
*/

#include  <stdio.h>
#include  <string.h>

int main(void)
{
	char  str[80];
	char  ultr[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";	/* 英大文字 */
	char  *p;

	printf("文字列を入力してください：");
	scanf("%s", str);

	puts("その文字列から英大文字を抽出します。");

	p = str;						/* 文字列の先頭文字を指す */

	while ((p = strpbrk(p, ultr)) != NULL)
		putchar(*p++);
	putchar('\n');

	return (0);
}