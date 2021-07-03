/*
	�s�񉉎Z���C�u�����̃e�X�g�v���O����
*/

#include  <stdio.h>
#include  "matrix.h"

/*--- �s��̓��e��\�� ---*/
void print(MAT *x)
{
	int	i, j;

	for (i = 1; i <= MATheight(*x); i++) {
		for (j = 1; j <= MATwidth(*x); j++)
			printf("%8.3f", MATelem(*x, i, j));
		putchar('\n');
	}
	putchar('\n');
}

int main(void)
{
	MAT	 mat1, mat2, mat3;

	MATalloc(&mat1, 2, 2);
	MATalloc(&mat2, 2, 2);
	MATalloc(&mat3, 2, 2);

	printf("�s��̍s����%d\n", MATheight(mat1));
	printf("�s��̗񐔁�%d\n", MATwidth(mat1));

	MATclear(&mat1);			/* ��s��ɂ��� */

	MATsquare(&mat2);			/* �P�ʍs��ɂ��� */

	MATelem(mat3, 1, 1) = 2.0;
	MATelem(mat3, 1, 2) = 3.0;
	MATelem(mat3, 2, 1) = 4.0;
	MATelem(mat3, 2, 2) = 5.0;

	MATadd(&mat1, &mat2, &mat3);		/* mat1��mat2��mat3�̘a��Ԃ� */
		print(&mat1);

	MATtransport(&mat2, &mat3);			/* mat2��mat3�̓]�u�s���Ԃ� */
		print(&mat2);

	MATassign(&mat1, &mat3);			/* mat1��mat3�������� */
		print(&mat1);

	MATcmul(&mat1, 3.0);				/* mat1��3.0�{���� */
		print(&mat1);

	MATmul(&mat2, &mat1, &mat3);		/* mat2��mat1��mat3�̐ς�Ԃ� */
		print(&mat2);

	MATsub(&mat2, &mat1, &mat3);		/* mat2��mat1��mat3�̍���Ԃ� */
		print(&mat2);

	MATfree(&mat1);						/* �̈��� */
	MATfree(&mat2);
	MATfree(&mat3);

	return (0);
}
