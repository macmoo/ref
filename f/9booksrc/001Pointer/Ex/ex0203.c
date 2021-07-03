/* ���K2-3�̉𓚗� */

#include  <stdio.h>

#define swap(type, x, y)	do { type temp = x; x = y; y = temp; } while (0)

/*--- *x[0]��*x[1]��*x[2]�ƂȂ�悤�Ƀ\�[�g ---*/
void sort_ptr3ary(int *x[])
{
	if (*x[0] > *x[1]) swap(int *, x[0], x[1]);
	if (*x[1] > *x[2]) swap(int *, x[1], x[2]);
	if (*x[0] > *x[1]) swap(int *, x[0], x[1]);
}

int main(void)
{
	int	 a = 5, b = 3, c = 7;
	int	 *p[3];

	p[0] = &a; p[1] = &b; p[2] = &c;

	sort_ptr3ary(p);

	printf("*p[0]�̒l��%d\n", *p[0]);			/* *p[0]�̒l��\�� */
	printf("*p[1]�̒l��%d\n", *p[1]);			/* *p[1]�̒l��\�� */
	printf("*p[2]�̒l��%d\n", *p[2]);			/* *p[2]�̒l��\�� */

	return (0);
}