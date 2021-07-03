/*
	memset関数の利用例（その２）
*/

#include  <stdio.h>
#include  <string.h>

/*--- 要素型がint型で要素数noの配列aの全要素に0を代入 ---*/
void fill_ary0(int a[], int no)
{
	if (no > 0)
		memset(a, 0, no * sizeof(int));
}

int main(void)
{
	int	 i;
	int	 x[] = {1, 2, 3, 4, 5};
	int	 nx = sizeof(x) / sizeof(x[0]);

	for (i = 0; i < nx; i++)
		printf("nx[%d] = %d\n", i, x[i]);

	fill_ary0(x, nx);		/* 配列xの全要素に0を代入 */

	puts("全要素に0を代入しました。");

	for (i = 0; i < nx; i++)
		printf("nx[%d] = %d\n", i, x[i]);

	return (0);
}
