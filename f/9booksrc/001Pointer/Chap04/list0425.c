/*
	文字列リテラル内の文字列の書きかえ
*/

#include  <stdio.h>

int main(void)
{
	char  str[] = "ABC";	/* 配列による文字列 */
	char  *ptr	= "XYZ";	/* ポインタによる文字列 */

	str[1] = 'Q';			/* ＯＫ！ */
	ptr[1] = 'Q';			/* ―？― */

	printf("文字列strは\"%s\"です。\n", str);
	printf("文字列ptrは\"%s\"です。\n", ptr);

	return (0);
}