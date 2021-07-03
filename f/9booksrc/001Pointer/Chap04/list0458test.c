/*
	strspn関数とstrcspn関数の利用例
*/

#include  <stdio.h>
#include  <string.h>

/*--- strspnの実現例：<stddef.h>のインクルードが必要 ---*/
size_t strspn(const char *s1, const char *s2)
{
	const char	*p = s1;

	for ( ; *s1; s1++) {
		const char	*t;

		for (t = s2; *t != *s1; t++)
			if (*t == '\0')
				return (s1 - p);
	}
	return (s1 - p);
}

/*--- strcspnの実現例：<stddef.h>のインクルードが必要 ---*/
size_t strcspn(const char *s1, const char *s2)
{
	const char	*p = s1;

	for ( ; *s1; s1++) {
		const char	*t;

		for (t = s2; *t; t++)
			if (*t == *s1)
				return (s1 - p);
	}
	return (s1 - p);
}

int main(void)
{
	char  str[60];		/* この文字列から探索 */
	char  ltr[] = "ABCDEFGHIJKLMNOPQRSTUVWXYXabcdefghijklmnopqrstuvwxyz";
	unsigned  n1, n2;

	printf("文字列を入力してください：");
	scanf("%s", str);

	n1 = strspn( str, ltr);		/* 先頭　英字部の文字数 */
	n2 = strcspn(str, ltr);		/* 先頭非英字部の文字数 */

	if (n1 == 0)
		printf("先頭は英字ではありません。\n");
	else
		printf("先頭%u文字が英字から構成されています。\n", n1);

	if (n2 == 0)
		printf("先頭は英字です。\n");
	else
		printf("先頭%u文字には英字は含まれていません。\n", n2);

	return (0);
}
