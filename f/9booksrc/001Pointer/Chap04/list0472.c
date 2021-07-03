/*
	strtod関数の利用例
*/

#include  <errno.h>
#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

int main(void)
{
	double	x;
	char	str[60];
	char	*ptr = str;

	printf("実数を入力してください：");
	scanf("%s", str);

	x = strtod(str, &ptr);

	if (errno == ERANGE)
		puts("double型の表現範囲を超えています。");
	else {
		if (ptr == str)
			puts("浮動小数点数に変換できませんでした。");
		else {
			printf("その値は%fです。\n", x);
			if (ptr != &str[strlen(str)])
				printf("%sの部分は変換できませんでした。\n", ptr);
		}
	}

	return (0);
}