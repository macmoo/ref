/*
	《ポインタによる文字列》の配列内の文字列を１文字ずつ走査して表示
*/

#include  <stdio.h>

int main(void)
{
	int	  i, j;
	char  *ptr[] = {"W140", "S", "500"};
	int	  np = sizeof(ptr) / sizeof(ptr[0]);	/* ptrの要素数 */

	for (i = 0; i < np; i++) {
		printf("ptr[%d] = \"", i);
		for (j = 0; ptr[i][j] != '\0'; j++)
			putchar(ptr[i][j]);
		printf("\"\n");
	}

	return (0);
}