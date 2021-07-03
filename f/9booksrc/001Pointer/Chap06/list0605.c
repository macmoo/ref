/*
	構造体中の構造体メンバのアドレスを表示・比較
*/

#include  <stdio.h>

int main(void)
{
	struct test {
		struct ms {
			int		x;
			double	y;
		} a;
		int	 b;
	} z;

	printf("&z.a   = %p\n", &z.a);
	printf("&z.a.x = %p\n", &z.a.x);
	printf("&z.a.y = %p\n", &z.a.y);
	printf("&z.b   = %p\n", &z.b);
	printf("&z.a   <= &z.b   = %d\n", &z.a	 <= &z.b);
	printf("&z.a.x <= &z.a.y = %d\n", &z.a.x <= &z.a.y);

	return (0);
}
