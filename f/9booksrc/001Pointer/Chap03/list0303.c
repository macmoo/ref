/*
	�Q�����z��̗v�f���Ԉ�������@�ŃA�N�Z�X
*/

#include  <stdio.h>

int main(void)
{
	int	 i, j;
	int	 ma[3][2];

	for (i = 0; i < 3; i++)
		for (j = 0; j < 2; j++)
			printf("ma[%d][%d] = %d\n", i, j, ma[i, j]);	/* �H */

	return (0);
}