/*
	共用体メンバのアドレスを表示
*/

#include  <stdio.h>

int main(void)
{
	union uxy {
		int		x;
		double	y;
	} a = {1};

	printf("&a.x = %p\n", &a.x);
	printf("&a.y = %p\n", &a.y);

	return (0);
}
