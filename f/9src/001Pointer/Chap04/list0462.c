/*
	strtok関数の利用例
*/

#include  <stdio.h>
#include  <string.h>

int main(void)
{
	char  str[60];			/* 分解する文字列 */
	char  sep[] = ".,;";	/* この文字で分解 */
	char  *p;

	printf("文字列を入力してください：");
	scanf("%s", str);

	p = strtok(str, sep);
	while (p != NULL) {
		printf("%s\n", p);
		p = strtok(NULL, sep); 
	}

	return (0);
}
