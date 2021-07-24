/*
	同じ綴りをもつ文字列リテラルへ書込み
*/

#include  <stdio.h>

int main(void)
{
	char  *ptr1 = "ABC";
	char  *ptr2 = "ABC";

	ptr2[1] = 'Z';

	printf("文字列ptr1は\"%s\"です。\n", ptr1);
	printf("文字列ptr2は\"%s\"です。\n", ptr2);

	return (0);
}