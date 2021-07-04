/*
	文字列リテラルの書きかえによる影響
*/

#include  <stdio.h>

int main(void)
{
	char  *ptr = "\n";		/* 改行 */

	*ptr = '\a';			/* 警報 */

	printf("\n");
	printf("\n");
	printf("\n");

	return (0);
}