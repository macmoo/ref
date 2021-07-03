/*
	”Ä—p‚Q•ª’TõŠÖ”ibsearchŠÖ”‚É€‚¶‚½d—lj
*/

#include  <stdlib.h>

/*--- ”Ä—p‚Q•ª’TõŠÖ”ibsearchŠÖ”‚É€‚¶‚½d—lj ---*/
void *binsearch(const void *key, const void *base, size_t nmemb, size_t size,
			 	int (*compar)(const void *, const void *))
{
	if (nmemb > 0) {
		size_t	pl = 0;							/* ’Tõ”ÍˆÍæ“ª‚Ì“Yš */
		size_t	pr = nmemb - 1;					/* ’Tõ”ÍˆÍ––”ö‚Ì“Yš */
		size_t	pc;								/* ’Tõ”ÍˆÍ’†‰›‚Ì“Yš */
		char  	*x = (char *)base;

		while (1) {
			int	 comp = compar(key, (const void *)&x[(pc = (pl+pr)/2) * size]);

			if (comp == 0)	 					/* ’Tõ¬Œ÷ */
				return (&x[pc * size]);
			else if (pl == pr)					/* ’Tõ”ÍˆÍ‚ª‚È‚­‚È‚Á‚½ */
				break;			
			else if (comp > 0)
				pl = pc + 1;					/* ’Tõ”ÍˆÍ‚ğŒã”¼‚Éi‚è‚Ş */
			else
				pr = pc - 1;					/* ’Tõ”ÍˆÍ‚ğ‘O”¼‚Éi‚è‚Ş */
		}
	}
	return (NULL);							/* ’Tõ¸”s */
}

#include <stdio.h>

/*--- intŒ^®”‚ğ”äŠr‚·‚éŠÖ” ---*/
int int_cmp(const int *a, const int *b)
{
	if (*a < *b)
		return (-1);
	else if (*a > *b)
		return (1);
	else
		return (0);
}

int main(void)
{
	int	 i, ky, idx;
	int	 x[7];
	int *ptr;
	int	 nx = sizeof(x) / sizeof(x[0]);

	printf("%dŒÂ‚Ì®”‚ğ¸‡‚É“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n", nx);

	printf("x[0]F");
	scanf("%ld", &x[0]);

	for (i = 1; i < nx; i++) {
		do {
			printf("x[%d]F", i);
			scanf("%ld", &x[i]);
		} while (x[i] < x[i - 1]);	/* ˆê‚Â‘O‚Ì’l‚æ‚è‚à‘å‚«‚¯‚ê‚ÎÄ“ü—Í */
	}
	
	printf("’T‚·’lF");
	scanf("%ld", &ky);

	ptr = binsearch(&ky, x, nx, sizeof(int), 
				   (int (*)(const void *, const void*))int_cmp);

	if (ptr == NULL)
		puts("\a’Tõ‚É¸”s‚µ‚Ü‚µ‚½B");
	else
		printf("%d‚Í%d”Ô–Ú‚É‚ ‚è‚Ü‚·B\n", ky, ptr - x + 1);

	return (0);
}
