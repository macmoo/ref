/*
	��`�̖ʐς����߂�
*/

#include  <stdio.h>

/*--- ��`�̖ʐς����߂� ---*/
double trapezoid(double w1, double w2, double h)
{
	return ((w1 + w2) * h / 2.0);
}

int main(void)
{
	double	x1, x2, height;

	puts("��`�̖ʐς����߂܂��B");
	printf("���F");	scanf("%lf", &x1);
	printf("����F");	scanf("%lf", &x2);
	printf("�����F");	scanf("%lf", &height);

	printf("�ʐς�%.4f�ł��B\n", trapezoid(x1, x2, height));

	return (0);
}