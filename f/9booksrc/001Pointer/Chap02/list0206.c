/*
	�|�C���^�̔�r�i�������Z�q�E�֌W���Z�q�j
*/

#include  <stdio.h>

int main(void)
{
	int	 x[5];
	int	 *p = x;	/* p��x[0]���w�� */

	printf("p     ==  x    : %d\n",	p	  ==  x	  );
	printf("p     == &x[1] : %d\n",	p	  == &x[1]);
	printf("&x[1] == &x[3] : %d\n",	&x[1] == &x[3]);
	printf("&x[2] != &x[3] : %d\n",	&x[2] != &x[3]);
	printf("&x[1] <  &x[2] : %d\n",	&x[1] <	 &x[2]);
	printf("&x[2] <= &x[1] : %d\n",	&x[2] <= &x[1]);

	return (0);
}