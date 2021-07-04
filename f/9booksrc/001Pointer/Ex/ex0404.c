/* 演習4-4の解答例 */

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
