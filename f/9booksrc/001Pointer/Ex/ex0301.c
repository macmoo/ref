/* 演習3-1の解答例 */

#include  <stdio.h>

int main(void)
{
	int	 i, j, k;
	int	 b[3][2][4];

	for (i = 0; i < 3; i++)
		for (j = 0; j < 2; j++)
			for (k = 0; k < 4; k++)
				printf("&b[%d][%d][%d] = %p\n", i, j, k, &b[i][j][k]);

	return (0);
}
