/*
	strtol関数の利用例
*/

#include  <errno.h>
#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

int main(void)
{
	int	  retry;
	int	  base;
	long  x;
	char  str[60];
	char  *ptr = str;

	puts("整数を入力してください。");

	do {
		printf("何進数：");	  scanf("%d", &base);
		printf("整数値：");	  scanf("%s", str);

		x = strtol(str, &ptr, base);

		if (errno == ERANGE)
			puts("long型の表現範囲を超えています。");
		else {
			if (ptr == str)
				puts("整数に変換できませんでした。");
			else {
				printf("10進数で%dです。\n", x);
				if (ptr != &str[strlen(str)])
					printf("%sの部分は変換できませんでした。\n", ptr);
			}
		}

		printf("もう一度（0－いいえ／1―はい）：");
		scanf("%d", &retry);

	} while (retry == 1);

	return (0);
}
