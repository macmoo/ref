/*
	strpbrk関数の利用例（その１）
*/

#include  <stdio.h>
#include  <string.h>

int main(void)
{
	char  s1[80], s2[80];
	char  *p;

	printf("文字列S1：");	  scanf("%s", s1);
	printf("文字列S2：");	  scanf("%s", s2);

	if ((p = strpbrk(s1, s2)) == NULL)
		printf("文字列S2中のどの文字も文字列S1中には存在しません。\n");
	else
		printf("文字列S2に含まれる文字の文字列S1での最初の出現以降は"
												"\"%s\"です。\n", p);

	return (0);
}
