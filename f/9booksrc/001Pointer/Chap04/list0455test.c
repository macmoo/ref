/*
	strstr関数の利用例
*/

#include  <stdio.h>
#include  <string.h>

/*--- strstrの実現例Ａ：<string.h>のインクルードが必要 ---*/
char *strstr(const char *s1, const char *s2)
{
	if (*s2 == '\0') return ((char *)s1);		/* s2は空文字列 */

	for ( ; (s1 = strchr(s1, *s2)) != NULL; ++s1) {		/* strchrを利用 */
		const char	*sc1 = s1;
		const char	*sc2 = s2;

		do {
			if (*++sc2 == '\0')
				return ((char *)s1);
		} while (*++sc1 == sc2);
	}

	return (NULL);
}

int main(void)
{
	int	  i;
	char  s1[80], s2[80];
	char  *p;

	printf("文字列S1：");	scanf("%s", s1);
	printf("文字列S2：");	scanf("%s", s2);

	p = strstr(s1, s2);

	if (p == NULL)
		printf("文字列S1中には文字列S2は存在しません。\n");
	else {
		int	 ofs = p - s1;
		printf("\n%s\n",  s1);				/* XXXABCDXXXXXXXXX	を表示 */
		printf("%*s|\n",  ofs, "");			/*	  |				を表示 */
		printf("%*s%s\n", ofs, "", s2);		/*	  ABCD			を表示 */
	}

	return (0);
}