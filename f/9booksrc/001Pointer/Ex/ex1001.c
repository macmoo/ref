/* 演習10-1の解答例 */

#include  <stdio.h>
#include  <stdarg.h>
#include  <string.h>

/*--- 空文字列または空ポインタより前の全引数の文字列を連結 ---*/
char *strxcat(char *s, ...)
{
	char	 *p = s;
	char	 *str;
	va_list	 ap;

	va_start(ap, s);			/* 可変個引数アクセス開始 */

	while (*s)					/* 第１文字列の末尾にポインタを移動 */
		s++;

	while ((str = va_arg(ap, char *)) != NULL  &&  *str != '\0') {
		while (*str)
			*s++ = *str++;
	}
	*s = '\0';					/* 文字列の終端 */

	va_end(ap);					/* 可変個引数アクセス終了 */

	return (p);
}

int main(void)
{
	char  s[100] = "ABC";

	printf("%s\n", strxcat(s, ""));
	printf("%s\n", strxcat(s, NULL));
	printf("%s\n", strxcat(s, "123", "456", ""));
	printf("%s\n", strxcat(s, "KGB", "FBI", NULL));

	return (0);
}
