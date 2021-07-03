/*
	sg—v‘f”‚ª3‚Å‚ ‚é”z—ñh‚Ì”z—ñt‚Ì—v‘f‚É“Yš‚Ì˜a‚ğ‘ã“ü
*/

#include  <stdio.h>

/*--- g—v‘f”‚ª3‚Å‚ ‚é”z—ñh‚Ì”z—ñ‚Ì‘S—v‘f‚É“Yš‚Ì˜a‚ğ‘ã“ü ---*/
void fill_avalue(int a[][3], int n)
{
	int	 i, j;

	for (i = 0; i < n; i++)
		for (j = 0; j < 3; j++)
			a[i][j] = i + j;
}

int main(void)
{
	int	 i, j;
	int	 mx[2][3];
	int	 my[4][3];
	
	fill_avalue(mx, 2);		/* mx‚Ì‘S—v‘f‚É“Yš‚Ì˜a‚ğŠi”[ */
	fill_avalue(my, 4);		/* my‚Ì‘S—v‘f‚É“Yš‚Ì˜a‚ğŠi”[ */

	puts("--- mx ---");
	for (i = 0; i < 2; i++) {
		for (j = 0; j < 3; j++)
			printf("%3d", mx[i][j]);
		putchar('\n');
	}

	puts("--- my ---");
	for (i = 0; i < 4; i++) {
		for (j = 0; j < 3; j++)
			printf("%3d", my[i][j]);
		putchar('\n');
	}

	return (0);
}