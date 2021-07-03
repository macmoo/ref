/*
	配列を構造体で包んで値渡し
*/

#include  <stdio.h>

typedef struct {
	int	 a[10];
} int10ary;

/*--- 受け取った構造体中の配列の全要素に0を格納 ---*/
void func(int10ary x)
{
	int	 i;

	for (i = 0; i < 10; i++)
		x.a[i] = 0;
}

int main(void)
{
	int	 i;
	int10ary  c;

	for (i = 0; i < 10; i++)
		c.a[i] = i;

	func(c);
	puts("全要素に0を代入しました。");		/* 嘘です */

	for (i = 0; i < 10; i++)
		printf("c.a[%d] = %d\n", i, c.a[i]);

	return (0);
}
