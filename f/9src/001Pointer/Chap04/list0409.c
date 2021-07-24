/*
	文字の配列に文字列を格納して表示（その２）
*/

#include  <stdio.h>

int main(void)
{
	char  str[6];

	str[0] = 'A';
	str[1] = 'B';
	str[2] = 'C';
	str[3] = '\0';			/* ここまでが文字列 */
	str[4] = 'D';
	str[5] = 'E';

	printf("配列strに文字列\"%s\"が格納されています。\n", str);

	return (0);
}