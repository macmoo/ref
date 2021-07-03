/*
	文字列からの文字の探索
*/

#include  <stdio.h>

/*--- 文字列sから文字cを探索 ---*/
char *str_chr(const char *s, int c)
{
	c = (char)c;
	while (*s != c) {
		if (*s == '\0')				/* 見つからなかった */
			return (NULL);
		s++;
	}
	return ((char *)s);
}

int main(void)
{
	char  *ptr;
	char  ch[2];	
	char  letter[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	printf("英大文字を入力してください：");
	scanf("%s", ch);

	if ((ptr = str_chr(letter, ch[0])) == NULL)
		printf("%cは英大文字ではありません。\n", ch[0]);
	else
		printf("%cから後のアルファベットは%sです。\n", ch[0], ptr);

	return (0);
}