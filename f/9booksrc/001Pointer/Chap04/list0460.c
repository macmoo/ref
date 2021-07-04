/*
	strspn関数とstrcspn関数の利用例
*/

#include  <stdio.h>
#include  <string.h>

int main(void)
{
	char  str[60];		/* この文字列から探索 */
	char  ltr[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	unsigned  n1, n2;

	printf("文字列を入力してください：");
	scanf("%s", str);

	n1 = strspn( str, ltr);		/* 先頭　英字部の文字数 */
	n2 = strcspn(str, ltr);		/* 先頭非英字部の文字数 */

	if (n1 == 0)
		printf("先頭は英字ではありません。\n");
	else
		printf("先頭%u文字が英字から構成されています。\n", n1);

	if (n2 == 0)
		printf("先頭は英字です。\n");
	else
		printf("先頭%u文字には英字は含まれていません。\n", n2);

	return (0);
}
