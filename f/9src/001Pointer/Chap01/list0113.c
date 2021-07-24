/*
	ポインタを整数値に変換して表示
*/

#include  <stdio.h>

int main(void)
{
	int	 nx;			/* nxはint型 */
	int	 *pt = &nx;		/* ptはnxを指すポインタ */

	/* nxへのポインタを符号無し整数値に変換して表示 */
	printf("&nx：%lu\n", (unsigned long)&nx);
	printf(" pt：%lu\n", (unsigned long)pt);

	return (0);
}