/*--- strcat�̎����� ---*/
char *strcat(char *s1, const char *s2)
{
	char  *p = s1;

	while (*s1) s1++;			/* s1�𖖔��܂Ői�߂� */
	while (*s1++ = *s2++) ;		/* s2��'\0'��������܂ŃR�s�[ */
	return (p);
}
