/*
	��̐����l�������Ƀ\�[�g
*/

#include  <stdio.h>

/*--- *x��*y�̒l������ ---*/
void swap(int *x, int *y)
{
	int	 temp = *x;
	*x = *y;
	*y = temp;
}

/*--- *na��*nb�ƂȂ�悤�Ƀ\�[�g ---*/
void sort2(int *na, int *nb)
{
	if (*na > *nb)
		swap(na, nb);		/* �|�C���^na, nb��n�� */
}

int main(void)
{
	int	 a, b;

	puts("��̐�������͂��Ă��������B");
	printf("�����`�F");	  scanf("%d", &a);
	printf("�����a�F");	  scanf("%d", &b);

	sort2(&a, &b);			/* a, b�ւ̃|�C���^��n�� */

	puts("�����Ƀ\�[�g���܂����B");
	printf("�`�̒l��%d�ł��B\n", a);
	printf("�a�̒l��%d�ł��B\n", b);

	return (0);
}