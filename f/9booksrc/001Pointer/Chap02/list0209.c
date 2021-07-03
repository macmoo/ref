/*
	配列とポインタの大きさを表示
*/

#include  <stdio.h>

/*--- 受け取ったポインタの大きさを表示 ---*/
void func(int a[])
{
	printf("sizeof(a) = %u\n", (unsigned)sizeof(a));	/* ポインタ */
}

int main(void)
{
	int	 x[5];

	printf("sizeof(x) = %u\n", (unsigned)sizeof(x));	/* 配列 */
	func(x);

	return (0);
}