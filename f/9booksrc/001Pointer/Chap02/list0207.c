/*
	�|�C���^�̌��Z�i�Q�� - ���Z�q�j
*/

#include  <stdio.h>

int main(void)
{
	int	 x[5];
	int	 *p = &x[4];	/* p��x[4]���w�� */

	printf(" x    - &x[1] : %d\n", (int)( x	   - &x[1]));
	printf("&x[2] - &x[0] : %d\n", (int)(&x[2] - &x[0]));
	printf("&x[3] -  p    : %d\n", (int)(&x[3] - p));

	return (0);
}