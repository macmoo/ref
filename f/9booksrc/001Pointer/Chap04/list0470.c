/*--- memcmpの実現例：<stddef.h>のインクルードが必要 ---*/
int memcmp(const void *s1, const void *s2, size_t n)
{
	const unsigned char	 *p1 = (const unsigned char *)s1;
	const unsigned char	 *p2 = (const unsigned char *)s2;

	while (n-- > 0) {
		if (*p1 != *p2)
			return (*p1 - *p2);
		p1++;
		p2++;
	}
	return (0);
}