/*--- strrchrの実現例：<stddef.h>のインクルードが必要 ---*/
char *strrchr(const char *s, int c)
{
	const char	*p = NULL;			/* 出現位置 */

	c = (char)c;
	while (1) {
		if (*s == c)				/* 見つけた */
			p = s;
		if (*s == '\0')				/* 走査終了 */
			break;
		s++;
	}
	return ((char *)p);
}
