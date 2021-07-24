/*
	汎用線形探索関数
*/

#include  <stdlib.h>

/*--- baseが指す要素の大きさがsizeで要素数がnmembの配列からkeyと一致する要素を
	  比較関数comparを用いて線形探索 ---*/
void *seqsearch(const void *key, const void *base, size_t nmemb, size_t size,
			 	int (*compar)(const void *, const void *))
{
	size_t	i;
	char  	*x = (char *)base;

	for (i = 0; i < nmemb; i++)
		if (!compar(key, (const void *)&x[i * size]))
			return (&x[i * size]);						/* 探索成功 */
	return (NULL);										/* 探索失敗 */
}

#include <stdio.h>

/*--- int型整数を比較する関数 ---*/
int int_cmp(const int *a, const int *b)
{
	if (*a < *b)
		return (-1);
	else if (*a > *b)
		return (1);
	else
		return (0);
}

int main(void)
{
	int	 i, ky, idx;
	int	 x[7];
	int *ptr;
	int	 nx = sizeof(x) / sizeof(x[0]);

	printf("%d個の整数を入力してください。\n", nx);

	printf("x[0]：");
	scanf("%ld", &x[0]);

	for (i = 1; i < nx; i++) {
		printf("x[%d]：", i);
		scanf("%ld", &x[i]);
	}
	
	printf("探す値：");
	scanf("%ld", &ky);

	ptr = seqsearch(&ky, x, nx, sizeof(int), 
				   (int (*)(const void *, const void*))int_cmp);

	if (ptr == NULL)
		puts("\a探索に失敗しました。");
	else
		printf("%dは%d番目にあります。\n", ky, ptr - x + 1);

	return (0);
}
