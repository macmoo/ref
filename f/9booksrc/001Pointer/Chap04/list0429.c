/*
	文字列を連結する（間違った）プログラム
*/

#include  <stdio.h>
#include  <string.h>

int main(void)
{
	char  *s = "I love ";

	strcat(s, "you.");			/* 駄目！ */

	printf("文字列sは\"%s\"です。\n", s);

	return (0);
}