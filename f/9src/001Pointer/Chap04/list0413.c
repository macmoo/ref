/*
	文字列の長さを求める（第１版）
*/

#include  <stdio.h>

/*--- 文字列sの長さを求める（第２版） ---*/
unsigned str_length(const char *s)
{
	unsigned  len = 0;

	for ( ; *s != '\0'; s++)
		len++;
	return (len);
}

int main(void)
{
	char  str[100];

	printf("文字列を入力して下さい：");
	scanf("%s", str);

	printf("文字列\"%s\"の長さは%uです。\n", str, str_length(str));

	return (0);
}