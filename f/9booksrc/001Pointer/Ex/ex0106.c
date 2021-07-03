/* ���K1-6�̉𓚗� */

#include  <stdio.h>

/*--- *x��*y�̒l������ ---*/
void swapd(double *x, double *y)
{
	double  temp = *x;
	*x = *y;
	*y = temp;
}

/*--- *pa��*pb��*pc�ƂȂ�悤�Ƀ\�[�g ---*/
void sort3d(double *pa, double *pb, double *pc)
{
	if (*pa > *pb) swapd(pa, pb);
	if (*pb > *pc) swapd(pb, pc);
	if (*pa > *pb) swapd(pa, pb);
}

int main(void)
{
	double	d1 = 3.14, d2 = 2.97, d3 = 0.01;

	sort3d(&d1, &d2, &d3);

	printf("d1�̒l��%.3f\n", d1);				/* d1�̒l��\�� */
	printf("d2�̒l��%.3f\n", d2);				/* d2�̒l��\�� */
	printf("d3�̒l��%.3f\n", d3);				/* d3�̒l��\�� */

	return (0);
}
