/*
	�z��̑S�v�f��0����
*/

#include  <stdio.h>

/*--- �z��x�̐擪n�̗v�f��0�����i��P�Łj ---*/
void fill_zero(int x[], int n)
{
	int	 i;

	for (i = 0; i < n; i++)
		x[i] = 0;
}

int main(void)
{
	int	 i;
	int	 a[5] = {10, 20, 30, 40, 50};
	int	 a_size = sizeof(a) / sizeof(a[0]);		/* �z��a�̗v�f�� */

	fill_zero(a, a_size);

	for (i = 0; i < a_size; i++)
		printf("a[%d] = %d\n", i, a[i]);		/* a[i]�̒l��\�� */

	return (0);
}