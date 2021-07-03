/*
	bsearchŠÖ”‚ğ—˜—p‚µ‚Ä—v‘f‚ğ’Tõ
*/

#include  <stdio.h>
#include  <stdlib.h>

/*--- ®”‚ğ”äŠr‚·‚éŠÖ” ---*/
int int_cmp(const int *a, const int *b)
{
	return (*a < *b ? -1 : *a > *b ? 1 : 0);
}

int main(void)
{
	int	 no, *p; 
	int	 x[10] = {1, 3, 15, 27, 31, 45, 51, 67, 69, 90};
	int	 nx = sizeof(x) / sizeof(x[0]);	/* x‚Ì—v‘f” */
	
	printf("’Tõ‚·‚é’l‚ğ“ü—Í‚¹‚æF");
	scanf("%d", &no);

	p = bsearch(&no, x, nx, sizeof(int),
							(int (*)(const void *, const void *))int_cmp);

	if (p != NULL)
		printf("x[%d]‚ªˆê’v‚µ‚Ü‚·B\n", (int)(p - &x[0]));
	else
		puts("Œ©‚Â‚©‚è‚Ü‚¹‚ñ‚Å‚µ‚½B");

	return (0);
}