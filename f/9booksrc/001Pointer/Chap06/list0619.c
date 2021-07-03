/*
	‹¤—p‘Ì‚Ì‰Šú‰»
*/

#include  <stdio.h>

int main(void)
{
	union uxy {
		int		x;
		double	y;
	} s = {4}, t = s;

	printf("s.x = %d    s.y = %.2f\n", s.x, s.y);
	printf("t.x = %d    t.y = %.2f\n", t.x, t.y);

	return (0);
}
