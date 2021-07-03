/* ‰‰K3-4‚Ì‰ğ“š—á */

#include  <stdio.h>

/*--- n~2~4‚Ì”z—ñ‚Ì‘S—v‘f‚É“Yš‚Ì˜a‚ğ‘ã“ü ---*/
void fill_avalue(int a[][2][4], int n)
{
	int	 i, j, k;

	for (i = 0; i < n; i++)
		for (j = 0; j < 2; j++)
			for (k = 0; k < 4; k++)
				a[i][j][k] = i + j + k;
}

int main(void)
{
	int	 i, j, k;
	int	 mx[3][2][4];

	fill_avalue(mx, 3);		/* mx‚Ì‘S—v‘f‚É“Yš‚Ì˜a‚ğŠi”[ */

	puts("--- mx ---");
	for (i = 0; i < 3; i++) {
		for (j = 0; j < 2; j++) {
			for (k = 0; k < 4; k++)
				printf("%3d", mx[i][j][k]);
			putchar('\n');
		}
	}

	return (0);
}
