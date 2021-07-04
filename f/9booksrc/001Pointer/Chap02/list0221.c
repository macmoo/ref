/*
	?귽깛?궻봹쀱
*/

#include  <stdio.h>

int main(void)
{
	int	 i, a = 5, b = 3, c = 7;
	int	 *p[3];

	p[0] = &a;	p[1] = &b;	p[2] = &c;
	printf("&a걖%p  a걖%d\n", &a, a);
	printf("&b걖%p  b걖%d\n", &b, b);
	printf("&c걖%p  c걖%d\n", &c, c);

	for (i = 0; i < 3; i++)
		printf("p[%d]걖%p  *p[%d]걖%d\n", i ,p[i], i, *p[i]);

	return (0);
}