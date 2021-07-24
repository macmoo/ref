/*
	構造体のメンバのオフセットを表示
*/

#include  <stdio.h>
#include  <stddef.h>

int main(void)
{
	struct abc {
		char  a;
		int	  b;
		long  c;
	} x;

	printf("aのオフセット＝%u\n", (unsigned)offsetof(struct abc, a));
	printf("bのオフセット＝%u\n", (unsigned)offsetof(struct abc, b));
	printf("cのオフセット＝%u\n", (unsigned)offsetof(struct abc, c));

	return (0);
}
