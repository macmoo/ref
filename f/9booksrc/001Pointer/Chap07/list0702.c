/*
	ƒ|ƒCƒ“ƒ^‚ÆŒ^•ÏŠ·
*/

#include  <stdio.h>

int main(void)
{
	double	x;
	char	*pc = &x;
	double	*pd;

	pc++;
	pd = (double *)pc;

	printf("pc = %p\n", pc);
	printf("pd = %p\n", pd);

	return (0);
}
