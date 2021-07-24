/*
	配列の要素のアドレスを表示
*/

#include  <stdio.h>

int main(void)
{
	int	 i;
	int	 a[5];
	int	 *p = a;		/* pはa[0]を指す */

	for (i = 0; i < 5; i++)
		printf("&a[%d] = %p  p+%d = %p\n", i, &a[i], i, p + i);

	return (0);
}