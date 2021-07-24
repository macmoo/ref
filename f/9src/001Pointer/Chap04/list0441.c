/*--- strncpyの実現例 ---*/
char *strncpy(char *s1, const char *s2, size_t n)
{
	char  *p = s1;
	while (n) {
		n--;
		if (!(*s1++ = *s2++)) break;	/* '\0'を見つけたら終了 */
	}
	while (n--)
		*s1++ = '\0';					/* 残りを'\0'で埋める */
	return (p);
}
