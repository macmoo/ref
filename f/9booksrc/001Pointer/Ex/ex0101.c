/* K1-1Μπα */

#include  <stdio.h>

int main(void)
{
	int	 nx  = 100;
	int	 *pt = &nx;

	printf("@nxΜl%d\n", nx);	/* @nxΝint^ */
	printf("*&nxΜl%d\n", *&nx);	/* *&nxΝint^ */
	printf("@ptΜl%p\n", pt);	/* @ptΝint *^ */
	printf("&*ptΜl%p\n", &*pt);	/* &*ptΝint *^ */

	printf("sizeof(nx)@%u\n", (unsigned)sizeof(nx));
	printf("sizeof(*&nx)%u\n", (unsigned)sizeof(*&nx));
	printf("sizeof(pt)@%u\n", (unsigned)sizeof(pt));
	printf("sizeof(&*pt)%u\n", (unsigned)sizeof(&*pt));

	return (0);
}
