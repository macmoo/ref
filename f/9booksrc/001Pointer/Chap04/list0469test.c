#include  <stdio.h>
#include  <stddef.h>

/*--- memchr‚ÌŽÀŒ»—á ---*/
void *memchr(const void *s, int c, size_t n)
{
	const unsigned char	 uc = c;
	const unsigned char	 *p = (const unsigned char *)s;

	while (n-- > 0) {
		if (*p == uc)
			return ((void *)p);
		p++;
	}
	return (NULL);
}

int main(void)
{
	printf("%s", memchr("ABC", 'B', 3));

	return (0);
}
