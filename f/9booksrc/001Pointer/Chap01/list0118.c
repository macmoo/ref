/*
	文字'*'を連続して表示（第２版）
*/

#include  <stdio.h>

/*--- 文字'*'をno個連続して表示 ---*/
void put_stars(int no)
{
	while (no-- > 0)
		putchar('*');
}

int main(void)
{
	int	 count;

	printf("何個表示しますか：");
	scanf("%d", &count);

	put_stars(count);

	printf("\n%d個表示しました。\n", count);

	return (0);
}