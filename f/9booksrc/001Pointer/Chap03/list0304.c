/*
	‚QŸŒ³”z—ñ‚ğŒë‚Á‚ÄéŒ¾
*/

#include  <stdio.h>

int main(void)
{
	int	 i, j;
	int	 ma[2, 3];		/* H */

	for (i = 0; i < 2; i++)
		for (j = 0; j < 3; j++)
			printf("ma[%d][%d] = %d\n", i, j, ma[i][j]);

	return (0);
}