/*
	みんなが驚く（？）プログラム
*/

#include  <stdio.h>

int main(void)
{
	int	 i;
	int	 a[4];

	0[a] = a[1] = *(a + 2) = *(3 + a) = 0;		/* 全要素に0を代入 */

	for (i = 0; i < 4; i++)
		printf("a[%d] = %d\n", i, a[i]);		/* a[i]の値を表示 */

	return (0);
}