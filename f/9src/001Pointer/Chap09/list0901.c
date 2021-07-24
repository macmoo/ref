/*
	台形の面積を求める
*/

#include  <stdio.h>

/*--- 台形の面積を求める ---*/
double trapezoid(double w1, double w2, double h)
{
	return ((w1 + w2) * h / 2.0);
}

int main(void)
{
	double	x1, x2, height;

	puts("台形の面積を求めます。");
	printf("上底：");	scanf("%lf", &x1);
	printf("下底：");	scanf("%lf", &x2);
	printf("高さ：");	scanf("%lf", &height);

	printf("面積は%.4fです。\n", trapezoid(x1, x2, height));

	return (0);
}