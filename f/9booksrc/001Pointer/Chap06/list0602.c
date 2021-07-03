/*
	初期化された構造体のメンバの値を表示
*/

#include  <stdio.h>

int main(void)
{
	struct xyz {
		int		x;
		long	y;
		double	z;
	} sa = {50, 99999999L, 3.14};

	printf("sa.x = %d\n",	sa.x);		/* メンバの値を表示 */
	printf("sa.y = %ld\n",	sa.y);		/*		　〃		*/
	printf("sa.z = %.2f\n",	sa.z);		/*		　〃		*/

	return (0);
}
