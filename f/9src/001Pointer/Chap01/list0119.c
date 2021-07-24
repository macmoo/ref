/*
	printf関数とscanf関数の利用例
*/

#include  <stdio.h>

int main(void)
{
	int	  i;
	long  k;
	char  s[20];

	printf("整数を入力してください：");
	scanf("%d", &i);					/* &が必要 */

	printf("整数を入力してください：");
	scanf("%ld", &k);					/* &が必要 */

	printf("文字列を入力してください：");
	scanf("%s", s);						/* 文字列の読込みでは&が不要 */

	printf("整数 i の値は%dです。\n",  i);			/* &は不要 */
	printf("整数 k の値は%ldです。\n", k);			/* &は不要 */
	printf("文字列sの値は%sです。\n",  s);			/* &は不要 */

	return (0);
}