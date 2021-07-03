/*
	‹ãX‚Ì‰ÁZ‚ÆæZ
*/

#include  <stdio.h>

/*--- x1‚Æx2‚Ì˜a‚ğ‹‚ß‚é ---*/
int sum(int x1, int x2)
{
	return (x1 + x2);
}

/*--- x1‚Æx2‚ÌÏ‚ğ‹‚ß‚é ---*/
int mul(int x1, int x2)
{
	return (x1 * x2);
}

/*--- ‹ãX‚Ì•\‚ğo—Í ---*/
void kuku(int calc(int, int))
{
	int	 i, j;

	for (i = 1; i <= 9; i++) {
		for (j = 1; j <= 9; j++)
			printf("%3d", calc(i, j));
		putchar('\n');
	}
}

int main(void)
{
	puts("‹ãX‚Ì‘«‚µZ•\");
	kuku(sum);

	puts("\n‹ãX‚ÌŠ|‚¯Z•\");
	kuku(mul);

	return (0);
}
