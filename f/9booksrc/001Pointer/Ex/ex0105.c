/* ‰‰K1-5‚Ì‰ğ“š—á */

#include  <stdio.h>

/*--- x‚Æy‚Ì˜a‚ğ*wa‚É·‚ğ*sa‚ÉŠi”[ ---*/
void sum_diff(int x, int y, int *wa, int *sa)
{
	*wa = x + y;						/* ˜a */
	*sa = (x > y) ? x - y : y - x;		/* · */
}

int main(void)
{
	int	 n1 = 100, n2 = 200;
	int	 sum, diff;		/* ˜a‚Æ· */ 

	sum_diff(n1, n2, &sum, &diff);

	printf("x‚Æy‚Ì˜a%d\n", sum);				/* sum‚Ì’l‚ğ•\¦ */
	printf("x‚Æy‚Ì·%d\n", diff);				/* diff‚Ì’l‚ğ•\¦ */

	return (0);
}
