/*
	��`�@�ɂ��ϕ��i��P�Łj
*/

#include  <stdio.h>

/*--- �֐�f(x) ---*/
double f(double x)
{
	return (x * x);
}

/*--- ��`�̖ʐς����߂� ---*/
double trapezoid(double w1, double w2, double h)
{
	return ((w1 + w2) * h / 2.0);
}

/*--- �֐�f��x1����x2�܂�n�����ő�`�@��p���Đϕ� ---*/
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

	printf("�J  �n�F");	  scanf("%lf", &x1);
	printf("�I  ���F");	  scanf("%lf", &x2);
	printf("�������F");	  scanf("%d",  &n);

	printf("�ϕ��l��%.4f\n", daikei(x1, x2, n));

	return (0);
}