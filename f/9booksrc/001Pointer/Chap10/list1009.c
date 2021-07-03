/*
	|  2  1	 1	|
	|  1  3	 1	| の逆行列を求める
	|  2  2	 4	|
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
	MAT	 a, b;

	MATalloc(&a, 3, 3);		/* aは３行３列の行列 */
	MATalloc(&b, 3, 3);		/* bは３行３列の行列 */
	MATelem(a,1,1) = 2.0; MATelem(a,1,2) = 1.0; MATelem(a,1,3) = 1.0;
	MATelem(a,2,1) = 1.0; MATelem(a,2,2) = 3.0; MATelem(a,2,3) = 1.0;
	MATelem(a,3,1) = 2.0; MATelem(a,3,2) = 2.0; MATelem(a,3,3) = 4.0;
	MATinvgauss(&b, &a);
	print(&a);
	print(&b);
	MATfree(&a);			/* 領域解放 */
	MATfree(&b);			/* 領域解放 */

	return (0);
}