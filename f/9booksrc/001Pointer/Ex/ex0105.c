/* ���K1-5�̉𓚗� */

#include  <stdio.h>

/*--- x��y�̘a��*wa�ɍ���*sa�Ɋi�[ ---*/
void sum_diff(int x, int y, int *wa, int *sa)
{
	*wa = x + y;						/* �a */
	*sa = (x > y) ? x - y : y - x;		/* �� */
}

int main(void)
{
	int	 n1 = 100, n2 = 200;
	int	 sum, diff;		/* �a�ƍ� */ 

	sum_diff(n1, n2, &sum, &diff);

	printf("x��y�̘a��%d\n", sum);				/* sum�̒l��\�� */
	printf("x��y�̍���%d\n", diff);				/* diff�̒l��\�� */

	return (0);
}
