/*
	《ポインタによる文字列》の配列内の文字列を表示
*/

#include  <stdio.h>

int main(void)
{
	int	  i;
	char  *ptr[] = {"W140",
					"S",
					"500"
					"V8"};
	int	  np = sizeof(ptr) / sizeof(ptr[0]);	/* ptrの要素数 */

	for (i = 0; i < np; i++)
		printf("ptr[%d] = \"%s\"\n", i, ptr[i]);

	return (0);
}