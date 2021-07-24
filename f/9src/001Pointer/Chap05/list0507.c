/*
	《ポインタによる文字列》の配列内の文字列を表示（関数版）
*/

#include  <stdio.h>

/*--- ポインタによる文字列str[n]を表示 ---*/
void print_pname(const char *str[], int n)
{
	printf("str[%d] = \"%s\"\n", n, str[n]);
}	

int main(void)
{
	int	  i;
	char  *ptr[] = {"W140", "S", "500"};
	int	  np = sizeof(ptr) / sizeof(ptr[0]);	/* ptrの要素数 */

	for (i = 0; i < np; i++)
		print_pname(ptr, i);

	return (0);
}