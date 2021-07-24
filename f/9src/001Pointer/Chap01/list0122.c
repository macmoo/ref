/*
	二つの浮動小数点数値を交換（間違い）
*/

#include  <stdio.h>

/*--- *xと*yの値を交換 ---*/
void swap(int *x, int *y)
{
	int	 temp = *x;
	*x = *y;
	*y = temp;
}

int main(void)
{
	double	a, b;

	puts("二つの実数を入力してください。");
	printf("実数Ａ：");	  scanf("%lf", &a);
	printf("実数Ｂ：");	  scanf("%lf", &b);

	swap(&a, &b);			/* a, bへのポインタを渡す */

	puts("実数ＡとＢの値を交換しました。");
	printf("Ａの値は%fです。\n", a);
	printf("Ｂの値は%fです。\n", b);

	return (0);
}