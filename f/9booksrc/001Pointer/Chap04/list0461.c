/*--- strtok�̎�����F<string.h>�̃C���N���[�h���K�v ---*/
char *strtok(char *s1, const char *s2)
{
	char  *pbegin, *pend;
	static char	 *save = "";

	pbegin = s1 ? s1 : save;
	pbegin += strspn(pbegin, s2);				/* strspn�𗘗p */
	if (*pbegin == '\0') {
		save = "";
		return (NULL);
	}
	pend = pbegin + strcspn(pbegin, s2);		/* strcspn�𗘗p */
	if (*pend != '\0')
		*pend++ = '\0';
	save = pend;
	return (pbegin);
}
