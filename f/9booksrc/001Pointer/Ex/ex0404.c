/* ���K4-4�̉𓚗� */

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
