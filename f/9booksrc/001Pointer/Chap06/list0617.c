/*
	�\���̂̃����o�ɒl��ǂݍ���
*/

#include  <stdio.h>

typedef struct {
	int		x;
	long	y;
	double	z;
} XYZ;

/*--- a�̎w���\���̂̃����o�ɒl��ǂݍ��� ---*/
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

	printf("sa.x = %d\n",	sa.x);	/* �����o�̒l��\�� */
	printf("sa.y = %ld\n",	sa.y);	/* �@�V�@ */
	printf("sa.z = %.2f\n",	sa.z);	/* �@�V�@ */

	return (0);
}
