/*
	ポインタが指すオブジェクトの値を表示
*/

#include  <stdio.h>

int main(void)
{
	int	 nx;			/* nxはint型 */
	int	 *pt;			/* ptはint *型 */

	nx = 57;							/* nxに整数57を代入 */
	pt = &nx;							/* ptにnxのアドレスを代入 */

	printf(" nxの値＝%d\n",	 nx);		/* nxの値を表示 */
	printf("*ptの値＝%d\n", *pt);		/* ptが指すオブジェクトの値を表示 */

	return (0);
}