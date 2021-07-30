/*
	配列の受渡し
*/

#include  <stdio.h>

/*--- 配列要素の先頭から順に1,2,3を格納 ---*/
void set123(int a[])
{
	a[0] = 1;
	a[1] = 2;
	a[2] = 3;
}

int main(void)
{
	int	 x[5];		/* 要素型がint型で要素数が5の配列 */

	set123(x);

	printf("x[0] = %d\n", x[0]);		/* x[0]の値を表示 */
	printf("x[1] = %d\n", x[1]);		/* x[1]の値を表示 */
	printf("x[2] = %d\n", x[2]);		/* x[2]の値を表示 */

	return (0);
}