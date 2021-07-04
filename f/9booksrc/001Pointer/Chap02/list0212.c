/*
	register付きで宣言された配列の要素数を表示（動作しない）
*/

#include  <stdio.h>

int main(void)
{
	register int  x[5];

	printf("x[0]の値は%dです。\n", x[0]);

	return (0);
}