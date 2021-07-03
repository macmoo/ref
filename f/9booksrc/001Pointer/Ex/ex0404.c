/* ‰‰K4-4‚Ì‰ð“š—á */

int str_dignum(const char *s)
{
	int	 count = 0;

	while (*s) {
		if (*s >= '0' && *s <= '9')
			count++;
		*s++;
	}
	return (count);
}
