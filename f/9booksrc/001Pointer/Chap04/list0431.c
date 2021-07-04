/*
	文字列の比較（間違い）
*/

#include  <stdio.h>

int main(void)
{
	char  str[10];

	printf("文字列を入力してください：");
	scanf("%s", str);

	if (str == "ABC")
		puts("あなたは\"ABC\"と入力しましたね。");
	else
		puts("あなたは\"ABC\"と入力しませんでしたね。");

	return (0);
}