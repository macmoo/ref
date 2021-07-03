/*
	strchr関数とstrrchr関数の利用例
*/

#include  <stdio.h>
#include  <string.h>

int main(void)
{
	char  str[60];		/* この文字列から探索 */
	char  tmp[60];
	int	  ch;			/* 探す文字 */
	char  *p;

	printf("文字列を入力してください：");
	scanf("%s", str);

	printf("探す文字は：");
	scanf("%s", tmp);			/* いったん文字列として読み込んで */
	ch = tmp[0];				/* その最初の文字を探索文字とする */

	if ((p = strchr(str, ch)) == NULL)				/* 先頭の出現を探索 */
		printf("文字'%c'は文字列中に存在しません。\n", ch);
	else {
		printf("文字'%c'の最初の出現以降は\"%s\"です。\n", ch, p);

		p = strrchr(str, ch);						/* 末尾の出現を探索 */

		printf("文字'%c'の最後の出現以降は\"%s\"です。\n", ch, p);
	}

	return (0);
}
