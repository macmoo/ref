/*
	�\���̃����o�̃A�h���X��\��
*/

#include  <stdio.h>

int main(void)
{
	struct xyz {
		int		x;
		long	y;
		double	z;
	} sa;

	printf("&sa.x = %p\n", &sa.x);		/* �����o�ւ̃|�C���^��\��	*/
	printf("&sa.y = %p\n", &sa.y);		/*			�@�V			*/
	printf("&sa.z = %p\n", &sa.z);		/*		�@	�@�V			*/

	return (0);
}
