/*
	�\���̂̃����o�ɒl�������ĕ\��
*/

#include  <stdio.h>

int main(void)
{
	struct xyz {			/* xyz�̓^�O�� */
		int		x;			/* �����o */
		long	y;			/* �@�V�@ */
		double	z;			/* �@�V�@ */
	};

	struct xyz	sa;					/* sa��struct xyz�^�̃I�u�W�F�N�g */

	sa.x = 50;						/* �����o�ɒl���� */
	sa.y = 99999999L;				/* �@�V�@ */
	sa.z = 3.14;					/* �@�V�@ */

	printf("sa.x = %d\n",	sa.x);	/* �����o�̒l��\�� */
	printf("sa.y = %ld\n",	sa.y);	/* �@�V�@ */
	printf("sa.z = %.2f\n",	sa.z);	/* �@�V�@ */

	return (0);
}
