/*
	��̕��������_���l�������i�ԈႢ�j
*/

#include  <stdio.h>

/*--- *x��*y�̒l������ ---*/
void swap(int *x, int *y)
{
	int	 temp = *x;
	*x = *y;
	*y = temp;
}

int main(void)
{
	double	a, b;

	puts("��̎�������͂��Ă��������B");
	printf("�����`�F");	  scanf("%lf", &a);
	printf("�����a�F");	  scanf("%lf", &b);

	swap(&a, &b);			/* a, b�ւ̃|�C���^��n�� */

	puts("�����`�Ƃa�̒l���������܂����B");
	printf("�`�̒l��%f�ł��B\n", a);
	printf("�a�̒l��%f�ł��B\n", b);

	return (0);
}