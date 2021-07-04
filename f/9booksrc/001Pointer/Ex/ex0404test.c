/* 演習4-4の解答例 */

int str_dignum(const char *s)
{
	int	 count = 0;

	while (*s) {
		if (*s >= '0' && *s <= '9')
			count++;
		*s++;
	}
	return (count);
}

#include  <stdio.h>

int main(void)
{
	printf("%d\n", str_dignum("A23A567A90"));
	printf("%d\n", str_dignum("1234567890"));
	printf("%d\n", str_dignum(""));

	return (0);
}