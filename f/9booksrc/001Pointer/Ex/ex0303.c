/* 演習3-3の解答例 */

#include  <stdio.h>

int main(void)
{
	int	 a[3][2][4];

	printf("sizeof(*a)		   = %u\n", (unsigned)sizeof(*a));
	printf("sizeof(a[0])	   = %u\n", (unsigned)sizeof(a[0]));
	printf("sizeof(a[0][0])	   = %u\n", (unsigned)sizeof(a[0][0]));
	printf("sizeof(a[0][0][0]) = %u\n", (unsigned)sizeof(a[0][0][0]));

	return (0);
}