/*--- memchrの実現例：<stddef.h>のインクルードが必要 ---*/
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