/*
	文字列の長さを求める（第１版）
*/

#include  <stdio.h>

/*--- 文字列sの長さを求める ---*/
unsigned str_length(const char s[])
{
	unsigned  len = 0;

	while (s[len] != '\0')
		len++;
	return (len);
}

int main(void)
{
	char  str[100];

	printf("文字列を入力してください：");
	scanf("%s", str);

	printf("文字列\"%s\"の長さは%uです。\n", str, str_length(str));

	return (0);
}