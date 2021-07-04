/*
	文字列内の文字を１文字ずつ表示する関数を呼び出す
*/

#include  <stdio.h>

/*--- 文字列sを表示 ---*/
void put_str(const char *s)
{
	while (*s)
		putchar(*s++);
}

int main(void)
{
	char  str[] = "ABC";	/* 配列による文字列 */
	char  *ptr  = "XYZ";	/* ポインタによる文字列 */

	put_str(str);	putchar('\n');
	put_str(ptr);	putchar('\n');
	put_str("UVW");	putchar('\n');

	return (0);
}