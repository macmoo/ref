/* 演習1-1の解答例 */

#include  <stdio.h>

int main(void)
{
	int	 nx  = 100;
	int	 *pt = &nx;

	printf("　nxの値＝%d\n", nx);	/* 　nxはint型 */
	printf("*&nxの値＝%d\n", *&nx);	/* *&nxはint型 */
	printf("　ptの値＝%p\n", pt);	/* 　ptはint *型 */
	printf("&*ptの値＝%p\n", &*pt);	/* &*ptはint *型 */

	printf("sizeof(nx)　＝%u\n", (unsigned)sizeof(nx));
	printf("sizeof(*&nx)＝%u\n", (unsigned)sizeof(*&nx));
	printf("sizeof(pt)　＝%u\n", (unsigned)sizeof(pt));
	printf("sizeof(&*pt)＝%u\n", (unsigned)sizeof(&*pt));

	return (0);
}
