/*
	台形法による積分（第１版）
*/

#include  <stdio.h>

/*--- 関数f(x) ---*/
double f(double x)
{
	return (x * x);
}

/*--- 台形の面積を求める ---*/
double trapezoid(double w1, double w2, double h)
{
	return ((w1 + w2) * h / 2.0);
}

/*--- 関数fをx1からx2までn分割で台形法を用いて積分 ---*/
double daikei(double x1, double x2, int n)
{
	int		i;
	double	s = 0.0;
	double	step = (x2 - x1) / n;

	for (i = 0; i < n; i++)
		s += trapezoid(f(x1 + step * i), f(x1 + step * (i + 1)), step);
	return (s);
}

int main(void)
{
	int		n;
	double	x1, x2;

	printf("開  始：");	  scanf("%lf", &x1);
	printf("終  了：");	  scanf("%lf", &x2);
	printf("分割数：");	  scanf("%d",  &n);

	printf("積分値＝%.4f\n", daikei(x1, x2, n));

	return (0);
}