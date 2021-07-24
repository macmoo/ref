/*
	文字列リテラルのアドレスを表示
*/

#include  <stdio.h>

int main(void)
{
	printf("文字列リテラル\"ABC\"は%p番地に格納されています。\n", "ABC");

	return (0);
}