/*
	同じ綴りをもつ文字列リテラルが共有されるかどうかを確認
*/

#include  <stdio.h>

int main(void)
{
	char  *ptr1 = "ABC";
	char  *ptr2 = "ABC";

	if (ptr1 == ptr2)
		puts("同じ綴りの文字列リテラルは共有されています。");
	else 
		puts("同じ綴りの文字列リテラルは共有されていません。");

	return (0);
}