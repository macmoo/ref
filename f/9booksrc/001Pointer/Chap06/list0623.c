/*
	���p�̂̃����o�ɒl��ǂݍ���
*/

#include  <stdio.h>

typedef		union {
	int		x;
	double	y;
} UXY;

/*--- a�̎w���\���̂̃����o�̂����ꂩ�ɒl��ǂݍ��� ---*/
void getUXY(UXY *a, int sw)
{
	switch (sw) {
	 case 0 : printf("x : ");	scanf("%d",	 &a->x);	break;
	 case 1 : printf("y : ");	scanf("%lf", &a->y);	break;
	}
}

int main(void)
{
	int	 s;
	UXY	 ua;

	printf("x��y�̂ǂ���ɒl����͂��܂����i0-x�^1-y�j�F");
	scanf("%d",	 &s);
	
	getUXY(&ua, s);

	printf("ua.x = %d\n",	ua.x);
	printf("ua.y = %.2f\n",	ua.y);

	return (0);
}
