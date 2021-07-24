/*
	構造体のメンバに値を代入して表示
*/

#include  <stdio.h>

int main(void)
{
	struct xyz {			/* xyzはタグ名 */
		int		x;			/* メンバ */
		long	y;			/* 　〃　 */
		double	z;			/* 　〃　 */
	};

	struct xyz	sa;					/* saはstruct xyz型のオブジェクト */

	sa.x = 50;						/* メンバに値を代入 */
	sa.y = 99999999L;				/* 　〃　 */
	sa.z = 3.14;					/* 　〃　 */

	printf("sa.x = %d\n",	sa.x);	/* メンバの値を表示 */
	printf("sa.y = %ld\n",	sa.y);	/* 　〃　 */
	printf("sa.z = %.2f\n",	sa.z);	/* 　〃　 */

	return (0);
}
