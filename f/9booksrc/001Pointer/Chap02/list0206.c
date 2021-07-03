/*
	ポインタの比較（等価演算子・関係演算子）
*/

#include  <stdio.h>

int main(void)
{
	int	 x[5];
	int	 *p = x;	/* pはx[0]を指す */

	printf("p     ==  x    : %d\n",	p	  ==  x	  );
	printf("p     == &x[1] : %d\n",	p	  == &x[1]);
	printf("&x[1] == &x[3] : %d\n",	&x[1] == &x[3]);
	printf("&x[2] != &x[3] : %d\n",	&x[2] != &x[3]);
	printf("&x[1] <  &x[2] : %d\n",	&x[1] <	 &x[2]);
	printf("&x[2] <= &x[1] : %d\n",	&x[2] <= &x[1]);

	return (0);
}