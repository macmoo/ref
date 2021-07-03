/*
	ポインタに文字列リテラルの先頭文字へのポインタを代入
*/

#include  <stdio.h>

int main(void)
{
	char  *ptr = "ABC";	/* ポインタによる文字列 */

	printf("文字列ptrは\"%s\"です。\n", ptr);

	ptr = "XYZ";		/* ptrに"XYZ"の先頭文字へのポインタを代入 */

	printf("文字列ptrは\"%s\"です。\n", ptr);

	return (0);
}