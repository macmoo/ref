/* ���K1-1�̉𓚗� */

#include  <stdio.h>

int main(void)
{
	int	 nx  = 100;
	int	 *pt = &nx;

	printf("�@nx�̒l��%d\n", nx);	/* �@nx��int�^ */
	printf("*&nx�̒l��%d\n", *&nx);	/* *&nx��int�^ */
	printf("�@pt�̒l��%p\n", pt);	/* �@pt��int *�^ */
	printf("&*pt�̒l��%p\n", &*pt);	/* &*pt��int *�^ */

	printf("sizeof(nx)�@��%u\n", (unsigned)sizeof(nx));
	printf("sizeof(*&nx)��%u\n", (unsigned)sizeof(*&nx));
	printf("sizeof(pt)�@��%u\n", (unsigned)sizeof(pt));
	printf("sizeof(&*pt)��%u\n", (unsigned)sizeof(&*pt));

	return (0);
}
