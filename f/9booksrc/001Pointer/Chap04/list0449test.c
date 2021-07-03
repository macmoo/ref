/*
	strchr関数とstrrchr関数の利用例
*/

#include  <stdio.h>
#include  <string.h>

/*--- strchrの実現例：<stddef.h>のインクルードが必要 ---*/
char *strchr(const char *s, int c)
{
	c = (char)c;
	while (*s != c) {
		if (*s == '\0')				/* 見つけることができなかった */
			return (NULL);
		s++;
	}
	return ((char *)s);
}

/*--- strrchrの実現例：<stddef.h>のインクルードが必要 ---*/
char *strrchr(const char *s, int c)
{
	const char	*p = NULL;			/* 出現位置 */

	c = (char)c;
	while (1) {
		if (*s == c)				/* 見つけた */
			p = s;
		if (*s == '\0')				/*	走査終了 */
			break;
		s++;
	}
	return ((char *)p);
}

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
