/*
	文字の配列に文字列リテラルの先頭文字へのポインタを代入
*/

#include  <stdio.h>

int main(void)
{
	char  str[4] = "ABC";	/* 配列による文字列 */

	printf("文字列strは\"%s\"です。\n", str);

	str = "XYZ";					/* エラー：配列への代入は不可 */

	printf("文字列strは\"%s\"です。\n", str);

	return (0);
}