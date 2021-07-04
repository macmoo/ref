/*--- memmoveの実現例 ---*/
void *memmove(void *s1, const void *s2, size_t n)
{
	char 		*p1 = (char *)s1;
	const char	*p2 = (const char *)s2;

	if (p1 > p2  &&  p1 < p2 + n)
		for (p1 += n, p2 += n; n > 0; n--)		/* 後ろからコピー */
			*p1-- = *p2--;
	else
		for ( ; n > 0; n--)						/* 前からコピー */
			*p1++ = *p2++;

	return (s1);
}
