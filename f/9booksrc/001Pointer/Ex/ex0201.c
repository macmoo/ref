/* 演習2-1の解答例 */

#include  <stdio.h>

int main(void)
{
	int	 i;
	int	 a[5];
	int	 *p = &a[2];		/* pはa[2]を指す */

	for (i = 0; i < 5; i++)
		printf("&a[%d] = %p  p+(%2d) = %p\n", i, &a[i], i - 2, p + i - 2);

	return (0);
}
