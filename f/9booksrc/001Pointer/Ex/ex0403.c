/* ‰‰K4-3‚Ì‰ğ“š—á */

int str_chnum(const char *s, int c)
{
	int	 count = 0;

	while (*s)
		if (*s++ == c)
			count++;

	return (count);
}
