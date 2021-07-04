/* 演習4-1の解答例 */

#include  <stdio.h>

int main(void)
{
	char  str[4];

	str[0] = '\0';
	str[1] = 'A';
	str[2] = 'B';
	str[3] = 'C';

	printf("配列strに文字列\"%s\"が格納されています。\n", str);

	return (0);
}
