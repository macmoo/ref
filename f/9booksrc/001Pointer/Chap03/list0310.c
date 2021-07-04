/*
	《“要素数が3である配列”の配列》の要素に添字の和を代入
*/

#include  <stdio.h>

/*--- “要素数が3である配列”の配列の全要素に添字の和を代入 ---*/
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
	
	fill_avalue(mx, 2);		/* mxの全要素に添字の和を格納 */
	fill_avalue(my, 4);		/* myの全要素に添字の和を格納 */

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