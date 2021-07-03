/*
	文字列を連結するプログラム
*/

#include  <stdio.h>
#include  <string.h>

int main(void)
{
	char  s[15] = "I love ";

	strcat(s, "you.");			/* sに"you."を連結 */

	printf("文字列sは\"%s\"です。\n", s);

	return (0);
}