/*
	《配列による文字列》の配列
*/

#include  <stdio.h>

int main(void)
{
	int	  i;
	char  ary[][5] = {"LISP", "C", "Ada"};

	for (i = 0; i < 3; i++)
		printf("ary[%d] = \"%s\"\n", i, ary[i]);

	return (0);
}