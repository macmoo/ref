/*--- strncpy‚ÌÀŒ»—á ---*/
char *strncpy(char *s1, const char *s2, size_t n)
{
	char  *p = s1;
	while (n) {
		n--;
		if (!(*s1++ = *s2++)) break;	/* '\0'‚ğŒ©‚Â‚¯‚½‚çI—¹ */
	}
	while (n--)
		*s1++ = '\0';					/* c‚è‚ğ'\0'‚Å–„‚ß‚é */
	return (p);
}
