/*
	�Q�����z��̗v�f�̒l��\��
*/

#include  <stdio.h>

int main(void)
{
	int	 i;
	int	 x[4][3];

	for (i = 0; i < 4; i++)
		printf("x[%d] = %p\n", i, x[i]);

	return (0);
}