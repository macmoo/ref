/*
	�\���̂̃����o�ɒl��������֐��i�ԈႢ�j
*/

#include  <stdio.h>

typedef struct {
	int		x;
	long	y;
	double	z;
} XYZ;

/*--- �\����a�̊e�����o�ɒlx, y, z���i�[ ---*/
void setXYZ(XYZ a, int x, long y, double z)
{
	a.x = x;
	a.y = y;
	a.z = z;
}

int main(void)
{
	XYZ	 sa = {50, 99999999L, 3.14};

	setXYZ(sa, 0, 12345L, 0.01);

	printf("sa.x = %d\n",	sa.x);
	printf("sa.y = %ld\n",	sa.y);
	printf("sa.z = %.2f\n", sa.z);

	return (0);
}
