/*
	‹¤—p‘Ì‚Ì—á
*/

#include  <stdio.h>

int main(void)
{
	union uxy {
		int		x;
		double	y;
	} s;

	s.x = 1;

	printf("s.x = %d\n",   s.x);
	printf("s.y = %.2f\n", s.y);

	return (0);
}
