/*
	ポインタの初期化
*/

#include  <stdio.h>

int main(void)
{
	int	 nx = 100;		/* nxの値は100 */
	int	 ny = 200;		/* nyの値は200 */
	int	 *px = &nx;		/* pxはnxを指すポインタ */
	int	 *py = &ny;		/* pyはnyを指すポインタ */

	printf(" nxの値＝%d\n",	 nx);	/* nxの値 */
	printf(" nyの値＝%d\n",	 ny);	/* nyの値 */
	printf("*pxの値＝%d\n", *px);	/* pxが指すオブジェクトの値 */
	printf("*pyの値＝%d\n", *py);	/* pyが指すオブジェクトの値 */

	return (0);
}