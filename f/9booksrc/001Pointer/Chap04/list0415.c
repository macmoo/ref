/*
	文字列を表示
*/

#include  <stdio.h>

/*--- 文字列sを表示 ---*/
void put_str(const char *s)
{
	while (*s)
		putchar(*s++);
}

int main(void)
{
	char  str[100];

	printf("文字列を入力してください：");
	scanf("%s", str);

	put_str(str);
	putchar('\n');

	return (0);
}