/*
	整数の値とポインタの値を表示
*/

#include  <stdio.h>

int main(void)
{
	int	 nx;			/* nxはint型（整数） */
	int	 *pt;			/* ptはint *型（ポインタ） */

	nx = 57;							/* nxに57を代入 */
	pt = &nx;							/* ptにnxのアドレスを代入 */

	printf(" nxの値＝%d\n",	 nx);		/* nxの値を表示 */
	printf("&nxの値＝%p\n", &nx);		/* nxのアドレスを表示 */
	printf(" ptの値＝%p\n",	 pt);		/* ptの値を表示 */

	return (0);
}