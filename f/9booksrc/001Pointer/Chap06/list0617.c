/*
	構造体のメンバに値を読み込む
*/

#include  <stdio.h>

typedef struct {
	int		x;
	long	y;
	double	z;
} XYZ;

/*--- aの指す構造体のメンバに値を読み込む ---*/
void getXYZ(XYZ *a)
{
	printf("x : ");	  scanf("%d",  &a->x);
	printf("y : ");	  scanf("%ld", &a->y);
	printf("z : ");	  scanf("%lf", &a->z);
}

int main(void)
{
	XYZ	 sa;

	getXYZ(&sa);

	printf("sa.x = %d\n",	sa.x);	/* メンバの値を表示 */
	printf("sa.y = %ld\n",	sa.y);	/* 　〃　 */
	printf("sa.z = %.2f\n",	sa.z);	/* 　〃　 */

	return (0);
}
