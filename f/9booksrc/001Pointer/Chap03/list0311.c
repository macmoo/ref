/*
	�Q�����z��̗v�f�ɓY���̘a����
*/

#include  <stdio.h>

/*--- n1�sn2��̂Q�����z��̑S�v�f�ɓY���̘a���� ---*/
void fill_avalue(int *a, int n1, int n2)
{
	int	 i, j;

	for (i = 0; i < n1; i++)
		for (j = 0; j < n2; j++)
			a[i * n2 + j] = i + j;
}

int main(void)
{
	int	 i, j;
	int	 mx[3][2];
	int	 my[4][4];

	fill_avalue(&mx[0][0], 3, 2);	/* mx�̑S�v�f�ɓY���̘a���i�[ */
	fill_avalue(&my[0][0], 4, 4);	/* my�̑S�v�f�ɓY���̘a���i�[ */

	puts("--- mx ---");
	for (i = 0; i < 3; i++) {
		for (j = 0; j < 2; j++)
			printf("%3d", mx[i][j]);
		putchar('\n');
	}

	puts("--- my ---");
	for (i = 0; i < 4; i++) {
		for (j = 0; j < 4; j++)
			printf("%3d", my[i][j]);
		putchar('\n');
	}

	return (0);
}