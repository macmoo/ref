/*
	ポインタの指す変数に実数値を読み込んで表示
*/

#include  <stdio.h>

int main(void)
{
	double	nx;
	double	*pt = &nx;		/* ptはnxを指す */

	printf("実数値を入力してください：");
	scanf("%lf", pt);		/* 読み込んだ値をptが指す変数に格納 */

	printf("あなたは%.2fと入力しましたね。\n", *pt);

	return (0);
}