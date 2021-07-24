/*
	文字列の比較
*/

#include  <stdio.h>
#include  <string.h>

int main(void)
{
	char  str[10];
	int	  cmp;

	printf("文字列を入力してください：");
	scanf("%s", str);

	cmp = strcmp(str, "ABC");			/* strと"ABC"を比較 */

	printf("その文字列は\"ABC\"");
	
	if (cmp == 0)
		puts("と等しいです。");
	else if (cmp > 0)
		puts("より大きいです。");
	else
		puts("より小さいです。");

	return (0);
}