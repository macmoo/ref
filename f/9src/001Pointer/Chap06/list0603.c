/*
	構造体メンバのアドレスを表示
*/

#include  <stdio.h>

int main(void)
{
	struct xyz {
		int		x;
		long	y;
		double	z;
	} sa;

	printf("&sa.x = %p\n", &sa.x);		/* メンバへのポインタを表示	*/
	printf("&sa.y = %p\n", &sa.y);		/*			　〃			*/
	printf("&sa.z = %p\n", &sa.z);		/*		　	　〃			*/

	return (0);
}
