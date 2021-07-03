/*--- memcpy‚ÌÀŒ»—á ---*/
void *memcpy(void *s1, const void *s2, size_t n)
{
	char		*p1 = (char *)s1;
	const char	*p2 = (const char *)s2;

	while (n-- > 0) {
		*p1 = *p2;
		p1++;
		p2++;
	}
	return (s1);
}
