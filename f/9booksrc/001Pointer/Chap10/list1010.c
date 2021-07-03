/*
	行列演算ライブラリのテストプログラム
*/

#include  <stdio.h>
#include  "matrix.h"

/*--- 行列の内容を表示 ---*/
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

	printf("行列の行数＝%d\n", MATheight(mat1));
	printf("行列の列数＝%d\n", MATwidth(mat1));

	MATclear(&mat1);			/* 零行列にする */

	MATsquare(&mat2);			/* 単位行列にする */

	MATelem(mat3, 1, 1) = 2.0;
	MATelem(mat3, 1, 2) = 3.0;
	MATelem(mat3, 2, 1) = 4.0;
	MATelem(mat3, 2, 2) = 5.0;

	MATadd(&mat1, &mat2, &mat3);		/* mat1にmat2とmat3の和を返す */
		print(&mat1);

	MATtransport(&mat2, &mat3);			/* mat2にmat3の転置行列を返す */
		print(&mat2);

	MATassign(&mat1, &mat3);			/* mat1にmat3を代入する */
		print(&mat1);

	MATcmul(&mat1, 3.0);				/* mat1を3.0倍する */
		print(&mat1);

	MATmul(&mat2, &mat1, &mat3);		/* mat2にmat1とmat3の積を返す */
		print(&mat2);

	MATsub(&mat2, &mat1, &mat3);		/* mat2にmat1とmat3の差を返す */
		print(&mat2);

	MATfree(&mat1);						/* 領域解放 */
	MATfree(&mat2);
	MATfree(&mat3);

	return (0);
}
