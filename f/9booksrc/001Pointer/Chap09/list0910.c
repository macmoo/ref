/*
	bsearch関数を利用して要素を探索
*/

#include  <stdio.h>
#include  <stdlib.h>

/*--- 整数を比較する関数 ---*/
int int_cmp(const int *a, const int *b)
{
	return (*a < *b ? -1 : *a > *b ? 1 : 0);
}

int main(void)
{
	int	 no, *p; 
	int	 x[10] = {1, 3, 15, 27, 31, 45, 51, 67, 69, 90};
	int	 nx = sizeof(x) / sizeof(x[0]);	/* xの要素数 */
	
	printf("探索する値を入力せよ：");
	scanf("%d", &no);

	p = bsearch(&no, x, nx, sizeof(int),
							(int (*)(const void *, const void *))int_cmp);

	if (p != NULL)
		printf("x[%d]が一致します。\n", (int)(p - &x[0]));
	else
		puts("見つかりませんでした。");

	return (0);
}