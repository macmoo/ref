/*
	strtok関数の利用例
*/

#include  <stdio.h>
#include  <string.h>

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

int main(void)
{
	char  str[60];			/* 分解する文字列 */
	char  sep[] = ".,;";	/* この文字で分解 */
	char  *p;

	printf("文字列を入力してください：");
	scanf("%s", str);

	p = strtok(str, sep);
	while (p != NULL) {
		printf("%s\n", p);
		p = strtok(NULL, sep); 
	}

	return (0);
}
