/*
	ポインタ値を交換する関数（間違い）
*/

#include  <stdio.h>

/*--- 二つのポインタを交換（間違い） ---*/
void swap_ptr(char *x, char *y)
{
	char  *tmp = x;
	x = y;
	y = tmp;
}
 
int main(void)
{
	char  *s1 = "ABC";
	char  *s2 = "DEF";

	printf("文字列s1は\"%s\"です。\n", s1);
	printf("文字列s2は\"%s\"です。\n", s2);

	swap_ptr(s1, s2);

	puts("ポインタs1とs2を交換しました。");

	printf("文字列s1は\"%s\"です。\n", s1);
	printf("文字列s2は\"%s\"です。\n", s2);

	return (0);
}