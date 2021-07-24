/*--- strstrの実現例Ａ：<string.h>のインクルードが必要 ---*/
char *strstr(const char *s1, const char *s2)
{
	if (*s2 == '\0') return ((char *)s1);		/* s2は空文字列 */

	for ( ; (s1 = strchr(s1, *s2)) != NULL; ++s1) {		/* strchrを利用 */
		const char	*sc1 = s1;
		const char	*sc2 = s2;

		do {
			if (*++sc2 == '\0')
				return ((char *)s1);
		} while (*++sc1 == sc2);
	}

	return (NULL);
}
