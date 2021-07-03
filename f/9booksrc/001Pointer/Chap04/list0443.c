/*--- strcatの実現例 ---*/
char *strcat(char *s1, const char *s2)
{
	char  *p = s1;

	while (*s1) s1++;			/* s1を末尾まで進める */
	while (*s1++ = *s2++) ;		/* s2に'\0'が見つかるまでコピー */
	return (p);
}
