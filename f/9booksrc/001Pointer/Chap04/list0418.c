/*
	文字列をコピー（第３版）
*/

#include  <stdio.h>

/*--- 文字列sをdにコピー（第３版） ---*/
char *str_copy(char *d, const char *s)
{
	char  *p = d;

	while (*d++ = *s++)
		;
	return (p);
}

int main(void)
{
	char  tmp[100];
	char  st1[100], st2[100], st3[100];

	printf("文字列を入力してください：");
	scanf("%s", tmp);

	/* st1にコピーした文字列をst2にもコピー */
	str_copy(st1, str_copy(st2, tmp));	

	printf("文字列st1は\"%s\"です。\n", st1);
	printf("文字列st2は\"%s\"です。\n", st2);
	printf("文字列st3は\"%s\"です。\n", str_copy(st3, tmp));

	return (0);
}