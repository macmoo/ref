/* ���K2-1�̉𓚗� */

#include  <stdio.h>

int main(void)
{
	int	 i;
	int	 a[5];
	int	 *p = &a[2];		/* p��a[2]���w�� */

	for (i = 0; i < 5; i++)
		printf("&a[%d] = %p  p+(%2d) = %p\n", i, &a[i], i - 2, p + i - 2);

	return (0);
}
