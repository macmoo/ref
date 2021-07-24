/*
	文字'*'を連続して表示（第１版）
*/

#include  <stdio.h>

/*--- 文字'*'をno個連続して表示 ---*/
void put_stars(int no)
{
	int	 i;

	for (i = 0; i < no; i++)
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