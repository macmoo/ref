/*
	構造体のメンバのアドレスを比較
*/

#include  <stdio.h>

int main(void)
{
	struct xyz {
		int		x;
		long	y;
		double	z;
	} sa;

	printf("&sa.x == &sa.x = %d\n", &sa.x == &sa.x);
	printf("&sa.x != &sa.y = %d\n", &sa.x != &sa.y);
	printf("&sa.x <  &sa.y = %d\n", &sa.x <	 &sa.y);
	printf("&sa.y <= &sa.z = %d\n", &sa.y <= &sa.z);
	printf("&sa.x >  &sa.z = %d\n", &sa.x >	 &sa.z);

	return (0);
}
