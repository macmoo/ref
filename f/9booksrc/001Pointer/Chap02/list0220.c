/*
	線形探索
*/

#include  <stdio.h>

/*--- 配列xの先頭n個の要素から値noを線形探索（第２版） ---*/
int seq_search(int *x, int n, int no)
{
	int	 *p = x;

	while (n-- > 0) {
		if (*p == no)			/* 探索成功 */
			return (p - x);
		else
			*p++;
	}
	return (-1);				/* 探索失敗 */
}

int main(void)
{
	int	 i, no, idx;
	int	 a[8];
	int	 a_size = sizeof(a) / sizeof(a[0]);		/* 配列aの要素数 */

	for (i = 0; i < a_size; i++) {
		printf("a[%d]：", i);		/* a[i]の入力を促す */
		scanf("%d", &a[i]);
	}
	printf("探す値は：");
	scanf("%d", &no);

	if ((idx = seq_search(a, a_size, no)) != -1)
		printf("その値をもつ要素はa[%d]です。\n", idx);
	else
		puts("見つかりませんでした。");

	return (0);
}