/* ‰‰K4-3‚Ì‰ğ“š—á */

int str_chnum(const char *s, int c)
{
	int	 count = 0;

	while (*s)
		if (*s++ == c)
			count++;

	return (count);
}

#include  <stdio.h>

int main(void)
{
	printf("%d\n", str_chnum("A23A567A90", 'A'));
	printf("%d\n", str_chnum("1234567890", 'A'));
	printf("%d\n", str_chnum("", 'A'));

	return (0);
}
