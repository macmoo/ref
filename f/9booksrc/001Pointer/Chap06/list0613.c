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

	struct xyz	*p = &sa;

	printf("(*p).x = %d\n",	  (*p).x);		/* p���w���\���̂̃����ox */
	printf("(*p).y = %ld\n",  (*p).y);		/*	�@�@�V�@�@�@�̃����oy */
	printf("(*p).z = %.2f\n", (*p).z);		/*	�@�@�V�@�@�@�̃����oz */

	return (0);
}
