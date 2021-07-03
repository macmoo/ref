/*
	文字列をコピー（第１版）
*/

#include  <stdio.h>

/*--- 文字列sをdにコピー（第１版） ---*/
void str_copy(char d[], const char s[])
{
	int	 i = 0;

	while ((d[i] = s[i]) != '\0')
		i++;
}

int main(void)
{
	char  str[100] = "ABC";
	char  tmp[100];

	printf("文字列strは\"%s\"です。\n", str);
	printf("コピーする文字列を入力してください：");
	scanf("%s", tmp);

	str_copy(str, tmp);		/* 文字列tmpをstrにコピー */

	printf("文字列strは\"%s\"です。\n", str);

	return (0);
}