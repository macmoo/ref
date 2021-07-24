/* 演習4-3の解答例 */

int str_chnum(const char *s, int c)
{
	int	 count = 0;

	while (*s)
		if (*s++ == c)
			count++;

	return (count);
}
