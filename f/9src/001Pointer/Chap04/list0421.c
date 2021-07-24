/*
	文字列内の文字を１文字ずつ表示
*/

#include  <stdio.h>

int main(void)
{
	char  str[] = "ABC";	/* 配列による文字列 */
	char  *ptr	= "XYZ";	/* ポインタによる文字列 */

	printf("文字列strは\"");
	putchar(str[0]);
	putchar(str[1]);
	putchar(str[2]);
	puts("\"です。");

	printf("文字列ptrは\"");
	putchar(ptr[0]);
	putchar(ptr[1]);
	putchar(ptr[2]);
	puts("\"です。");

	return (0);
}