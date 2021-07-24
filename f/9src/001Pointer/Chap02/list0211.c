/*
	register付きで宣言された配列の大きさを表示
*/

#include  <stdio.h>

int main(void)
{
	register int  x[5];

	printf("sizeof(x) = %u\n", (unsigned)sizeof(x));

	return (0);
}