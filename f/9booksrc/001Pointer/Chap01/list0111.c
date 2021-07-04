/*
	register記憶域クラス指定子付きで宣言されたオブジェクトのアドレス
*/

#include  <stdio.h>

int main(void)
{
	register int  nx;

	printf("&nxの値は%pです。\n", &nx);			/* エラー */

	return (0);
}