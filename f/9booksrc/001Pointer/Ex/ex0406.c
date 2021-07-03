/* ‰‰K4-6‚Ì‰ğ“š—á */

void swap_str(char s1[], char s2[])
{
	while (*s1  ||  *s2) {
		char  t = *s1;
		*s1++ = *s2;
		*s2++ = t;
	}
	*s1 = *s2 = '\0';
}
