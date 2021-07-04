/*
	共用体の大きさとメンバの大きさを表示
*/

#include  <stdio.h>

int main(void)
{
	union uxy {
		int		x;
		double	y;
	} a;

	printf("sizeof(union xyz) = %u\n",	(unsigned)sizeof(union uxy));
	printf("sizeof(a)         = %u\n",	(unsigned)sizeof(a));
	printf("sizeof(a.x)       = %u\n",	(unsigned)sizeof(a.x));
	printf("sizeof(a.y)       = %u\n",	(unsigned)sizeof(a.y));

	return (0);
}
