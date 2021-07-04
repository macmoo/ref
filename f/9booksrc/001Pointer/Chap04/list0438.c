/*--- strlen궻렳뙸쀡괶 ---*/
size_t strlen(const char *s)
{
	const char	*p = s;

	while (*s)
		s++;
	return (s - p);
}
