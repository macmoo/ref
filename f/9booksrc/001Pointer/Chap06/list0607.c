/*
	構造体のメンバに値を読み込む（その１）
*/

#include  <stdio.h>

typedef struct {
	int		x;
	long	y;
	double	z;
} XYZ;

int main(void)
{
	XYZ	 sa;

	printf("sa.x : ");	scanf("%d",	 &sa.x);
	printf("sa.y : ");	scanf("%ld", &sa.y);
	printf("sa.z : ");	scanf("%lf", &sa.z);

	printf("sa.x = %d\n",	sa.x);
	printf("sa.y = %ld\n",	sa.y);
	printf("sa.z = %.2f\n",	sa.z);

	return (0);
}
