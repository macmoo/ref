/*
	�݂�Ȃ������i�H�j�v���O����
*/

#include  <stdio.h>

int main(void)
{
	int	 i;
	int	 a[4];

	0[a] = a[1] = *(a + 2) = *(3 + a) = 0;		/* �S�v�f��0���� */

	for (i = 0; i < 4; i++)
		printf("a[%d] = %d\n", i, a[i]);		/* a[i]�̒l��\�� */

	return (0);
}