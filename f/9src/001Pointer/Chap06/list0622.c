/*
	ポインタが指す共用体のメンバの値を表示
*/

#include  <stdio.h>

int main(void)
{
	union uxy {
		int		x;
		double	y;
	} a = {1}, *p = &a;

	printf("p->x = %d\n",	p->x);
	printf("p->y = %.2f\n",	p->y);

	return (0);
}
