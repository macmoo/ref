/*
	構造体を返す関数
*/

#include  <stdio.h>

typedef struct {
	int		x;
	long	y;
	double	z;
} XYZ;

/*--- x, y, zの値をもつ構造体を返す ---*/
XYZ XYZof(int x, long y, double z)
{
	XYZ	 temp;

	temp.x = x;
	temp.y = y;
	temp.z = z;

	return (temp);
}

int main(void)
{
	XYZ	 sa = {50, 99999999L, 3.14};

	puts("□ 代入前 □");
	printf("sa.x = %d\n",	sa.x);
	printf("sa.y = %ld\n",	sa.y);
	printf("sa.z = %.2f\n", sa.z);

	sa = XYZof(0, 15, 9.99);

	puts("□ 代入後 □");
	printf("sa.x = %d\n",	sa.x);
	printf("sa.y = %ld\n",	sa.y);
	printf("sa.z = %.2f\n",	sa.z);

	return (0);
}
