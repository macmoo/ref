/*
	�Q�s�R��̂Q�����z��̑S�v�f��0����
*/

#include  <stdio.h>

/*--- �Q�s�R��̂Q�����z��x�̑S�v�f��0���� ---*/
void fill_zero23(int x[2][3])
{
	int	 i, j;

	for (i = 0; i < 2; i++)
		for (j = 0; j < 3; j++)
			x[i][j] = 0;
}

int main(void)
{
	int	 i, j;
	int	 a[2][3] = { {1, 2, 3}, {4, 5, 6} };

	fill_zero23(a);

	for (i = 0; i < 2; i++) {
		for (j = 0; j < 3; j++)
			printf("%3d", a[i][j]);
		putchar('\n');
	}

	return (0);
}