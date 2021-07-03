/* ���K6-2�̉𓚗� */

#include  <stdio.h>

struct xyz {
	int		x;
	long	y;
	double	z;
};

/*--- �����ox�̏����ƂȂ�悤��a,b����ׂ����� ---*/
void sortXYZ(struct xyz *a, struct xyz *b)
{
	if (a->x > b->x) {
		struct xyz	temp = *a;
		*a = *b;
		*b = temp;
	}
}

/*--- a�̎w���\���̂̃����o�ɒl��ǂݍ��� ---*/
void getXYZ(struct xyz *a)
{
	printf("x : ");	  scanf("%d",  &a->x);
	printf("y : ");	  scanf("%ld", &a->y);
	printf("z : ");	  scanf("%lf", &a->z);
}

int main(void)
{
	struct xyz	a, b;

	puts("a�̊e�����o�̒l��������B");
	getXYZ(&a);

	puts("b�̊e�����o�̒l��������B");
	getXYZ(&b);

	puts("�����ox�̏����Ƀ\�[�g���܂����B");
	sortXYZ(&a, &b);

	printf("a.x = %d\n",	a.x);	/* �����o�̒l��\�� */
	printf("a.y = %ld\n",	a.y);	/* �@�V�@ */
	printf("a.z = %.2f\n",	a.z);	/* �@�V�@ */

	printf("b.x = %d\n",	b.x);	/* �����o�̒l��\�� */
	printf("b.y = %ld\n",	b.y);	/* �@�V�@ */
	printf("b.z = %.2f\n",	b.z);	/* �@�V�@ */

	return (0);
}
