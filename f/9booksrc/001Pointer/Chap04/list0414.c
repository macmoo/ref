/*
	文字列の長さを求める（第１版）
*/

#include  <stdio.h>

/*--- 文字列sの長さを求める（第３版） ---*/
unsigned str_length(const char *s)
{
	const char	*p = s;

	while (*s)
		s++;
	return (s - p);
}

int main(void)
{
	char  str[100];

	printf("文字列を入力して下さい：");
	scanf("%s", str);

	printf("文字列\"%s\"の長さは%uです。\n", str, str_length(str));

	return (0);
}