/*
	文字列リテラルを文字列として表示
*/

#include  <stdio.h>

int main(void)
{
	printf("文字列リテラル\"ABCD\"＝\"%s\"\n",	  "ABCD");
	printf("文字列リテラル\"AB\\0CD\"＝\"%s\"\n", "AB\0CD");

	return (0);
}