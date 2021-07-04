/*
	オブジェクトの値とアドレスを表示
*/

#include  <stdio.h>

int main(void)
{
	int	 nx = 15;		/* nxはint型 */
	int	 ny = 73;		/* nyはint型 */

	printf("nxの値＝%d\n", nx);				/* nxの値を表示 */
	printf("nyの値＝%d\n", ny);				/* nyの値を表示 */

	printf("nxのアドレス＝%p\n", &nx);		/* nxのアドレスを表示 */
	printf("nyのアドレス＝%p\n", &ny);		/* nyのアドレスを表示 */

	return (0);
}