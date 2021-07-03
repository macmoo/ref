/* 演習7-2の解答例 */

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

void *recalloc(void *ptr, size_t size, size_t old_size)
{
	void  *tmp;

	if (size == 0)
		return (NULL);
	tmp = realloc(ptr, size);
	if (tmp != NULL  &&  size > old_size)
		memset((char *)tmp + old_size, 0, (size - old_size));

	return (tmp);
}

int main(void)
{
	int	 no;		/* 配列の要素数 */
	int	 *p;

	printf("確保する配列の要素数：");
	scanf("%d", &no);

	p = (int *)calloc(no, sizeof(int));		/* 整数をno個動的に確保 */

	if (p == NULL)
		puts("記憶域の確保に失敗しました。");
	else {
		int	 i, n2;
		int	 *temp;

		printf("要素数をいくつに変更しますか：");
		scanf("%d", &n2);

		/* 要素数をn2に変更 */
		temp = (int *)recalloc(p, n2 * sizeof(int), no * sizeof(int));

		if (temp == NULL)
			puts("領域の大きさの変更に失敗しました。");
		else {
			p = temp;

			for (i = 0; i < n2; i++)		/* 全要素の値を表示 */
				printf("p[%d] = %d\n", i, p[i]);
		}
		free(p);							/* 確保していた領域を解放 */
	}
	return (0);
}
