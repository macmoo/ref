/*--- strncpy�̎����� ---*/
char *strncpy(char *s1, const char *s2, size_t n)
{
	char  *p = s1;
	while (n) {
		n--;
		if (!(*s1++ = *s2++)) break;	/* '\0'����������I�� */
	}
	while (n--)
		*s1++ = '\0';					/* �c���'\0'�Ŗ��߂� */
	return (p);
}
