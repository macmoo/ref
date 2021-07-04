/*
	文字列の実現法
*/

#include  <stdio.h>

int main(void)
{
	char  str[] = "ABC";	/* strの各要素の値は'A','B','C','\0' */
	char  *ptr	= "XYZ";	/* ptrは"XYZ"を指す */

	printf("文字列strは\"%s\"です。\n", str);
	printf("文字列ptrは\"%s\"です。\n", ptr);

	return (0);
}