/*--- strtokの実現例：<string.h>のインクルードが必要 ---*/
char *strtok(char *s1, const char *s2)
{
	char  *pbegin, *pend;
	static char	 *save = "";

	pbegin = s1 ? s1 : save;
	pbegin += strspn(pbegin, s2);				/* strspnを利用 */
	if (*pbegin == '\0') {
		save = "";
		return (NULL);
	}
	pend = pbegin + strcspn(pbegin, s2);		/* strcspnを利用 */
	if (*pend != '\0')
		*pend++ = '\0';
	save = pend;
	return (pbegin);
}
