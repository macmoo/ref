/*
	２次元配列の要素に添字の和を代入
*/

#include  <stdio.h>

/*--- n1行n2列の２次元配列の全要素に添字の和を代入 ---*/
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

	fill_avalue(&mx[0][0], 3, 2);	/* mxの全要素に添字の和を格納 */
	fill_avalue(&my[0][0], 4, 4);	/* myの全要素に添字の和を格納 */

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