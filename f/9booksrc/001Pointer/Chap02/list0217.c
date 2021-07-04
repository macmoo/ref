/*
	配列の全要素に0を代入
*/

#include  <stdio.h>

/*--- 配列xの先頭n個の要素に0を代入（第３版） ---*/
void fill_zero(int x[], int n)
{
	while (n-- > 0) {
		*x = 0;
		x++;
	}
}

int main(void)
{
	int	 i;
	int	 a[5] = {10, 20, 30, 40, 50};
	int	 a_size = sizeof(a) / sizeof(a[0]);		/* 配列aの要素数 */

	fill_zero(a, a_size);

	for (i = 0; i < a_size; i++)
		printf("a[%d] = %d\n", i, a[i]);		/* a[i]の値を表示 */

	return (0);
}