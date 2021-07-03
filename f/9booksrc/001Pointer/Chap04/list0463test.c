/*
	memset関数の利用例（その１）
*/

#include  <stdio.h>
#include  <string.h>

/*--- memsetの実現例 ---*/
void *memset(void *s, int c, size_t n)
{
	const unsigned char	 uc = c;
	unsigned char		 *p = (unsigned char *)s;

	while (n-- > 0)
		*p++ = uc;

	return (s);
}

/*--- pを先頭としてnバイトの記憶域の内容を16進数で表示 ---*/
void put_bin(const char *p, size_t n)
{
	size_t	i;

	for (i = 0; i < n; i++)
		printf("%02X ", (unsigned char)p[i]);
}

int main(void)
{
	char  str[] = "ABCDEFG";
	int	  ns = sizeof(str);

	printf("str : ");
	put_bin(str, ns);		/* 配列strの内容を16進数で表示 */

	memset(str, 0, ns);		/* 配列strの全バイトに0を代入 */

	printf("\n全バイトに0を代入しました。\n");
	printf("str : ");
	put_bin(str, ns);		/* 配列strの内容を16進数で表示 */

	return (0);
}