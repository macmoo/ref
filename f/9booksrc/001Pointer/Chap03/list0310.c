/*
	�s�g�v�f����3�ł���z��h�̔z��t�̗v�f�ɓY���̘a����
*/

#include  <stdio.h>

/*--- �g�v�f����3�ł���z��h�̔z��̑S�v�f�ɓY���̘a���� ---*/
void fill_avalue(int a[][3], int n)
{
	int	 i, j;

	for (i = 0; i < n; i++)
		for (j = 0; j < 3; j++)
			a[i][j] = i + j;
}

int main(void)
{
	int	 i, j;
	int	 mx[2][3];
	int	 my[4][3];
	
	fill_avalue(mx, 2);		/* mx�̑S�v�f�ɓY���̘a���i�[ */
	fill_avalue(my, 4);		/* my�̑S�v�f�ɓY���̘a���i�[ */

	puts("--- mx ---");
	for (i = 0; i < 2; i++) {
		for (j = 0; j < 3; j++)
			printf("%3d", mx[i][j]);
		putchar('\n');
	}

	puts("--- my ---");
	for (i = 0; i < 4; i++) {
		for (j = 0; j < 3; j++)
			printf("%3d", my[i][j]);
		putchar('\n');
	}

	return (0);
}