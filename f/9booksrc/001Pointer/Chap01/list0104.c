/*
	ポインタを通じて間接的にオブジェクトに値を代入
*/

#include  <stdio.h>

int main(void)
{
	int	 nx, ny;
	int	 *p;

	p  = &nx;	/* pにnxのアドレスを代入：pはnxを指す */
	*p = 100;	/* pが指すnxに100を代入 */

	p  = &ny;	/* pにnyのアドレスを代入：pはnyを指す */
	*p = 300;	/* pが指すnyに300を代入 */

	printf("nxの値＝%d\n", nx);
	printf("nyの値＝%d\n", ny);

	return (0);
}