/*
	���������ꂽ�\���̂̃����o�̒l��\��
*/

#include  <stdio.h>

int main(void)
{
	struct xyz {
		int		x;
		long	y;
		double	z;
	} sa = {50, 99999999L, 3.14};

	printf("sa.x = %d\n",	sa.x);		/* �����o�̒l��\�� */
	printf("sa.y = %ld\n",	sa.y);		/*		�@�V		*/
	printf("sa.z = %.2f\n",	sa.z);		/*		�@�V		*/

	return (0);
}
