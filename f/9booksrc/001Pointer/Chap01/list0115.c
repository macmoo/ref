/*
	二つの整数値を交換
*/

#include  <stdio.h>

/*--- *xと*yの値を交換 ---*/
void swap(int *x, int *y)
{
	int	 temp = *x;
	*x = *y;
	*y = temp;
}

int main(void)
{
	int	 a, b;

	puts("二つの整数を入力してください。");
	printf("整数Ａ：");	  scanf("%d", &a);
	printf("整数Ｂ：");	  scanf("%d", &b);

	swap(&a, &b);			/* a, bへのポインタを渡す */

	puts("整数ＡとＢの値を交換しました。");
	printf("Ａの値は%dです。\n", a);
	printf("Ｂの値は%dです。\n", b);

	return (0);
}