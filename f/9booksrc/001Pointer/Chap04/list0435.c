/*
	一つの文字列リテラルで姓名と姓を表す（その１）
*/

#include  <stdio.h>

int main(void)
{
	char  *s1 = "BohYoh Shibata";
	char  *s2 = &s1[7];

	printf("フルネームは%sです。\n", s1);
	printf("ファミリーネームは%sです。\n", s2);

	return (0);
}