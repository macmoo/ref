/*
	《配列による文字列》の配列内の文字列を表示
*/

#include  <stdio.h>

/*--- ２次元配列内の文字を１文字ずつ走査して表示 ---*/
void print_pname(const char str[][5], int n)
{
	int	 i, j;

	for (i = 0; i < n; i++) {
		printf("str[%d] = \"", i);
		for (j = 0; str[i][j] != '\0'; j++)
			putchar(str[i][j]);
		printf("\"\n");
	}
}	

int main(void)
{
	char  ary[][5] = {"LISP", "C", "Ada"};

	print_pname(ary, sizeof(ary) / sizeof(ary[0]));

	return (0);
}