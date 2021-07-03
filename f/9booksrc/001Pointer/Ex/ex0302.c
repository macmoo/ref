/* ‰‰K3-2‚Ì‰ğ“š—á */

#include  <stdio.h>

int main(void)
{
	int	 x[3][2][4];

	printf("”z—ñx‚Í%d~%d~%d‚Ì‚RŸŒ³”z—ñ‚Å‚·B\n",
				(int)(sizeof(x)       / sizeof(x[0])),
				(int)(sizeof(x[0])    / sizeof(x[0][0])),
				(int)(sizeof(x[0][0]) / sizeof(x[0][0][0])));

	return (0);
}
