/*
	strstr関数の利用例
*/

#include  <stdio.h>
#include  <string.h>

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