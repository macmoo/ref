/*
	汎用２分探索関数（bsearch関数を拡張）
*/

#include  <stdlib.h>

/*--- baseが指す要素の大きさがsizeで要素数がnmembの配列からkeyと一致する要素を
	  比較関数comparを用いて２分探索
	  ※ keyと等しい要素が複数存在する場合は最も先頭の要素を探す ---*/
void *bsearchx(const void *key, const void *base, size_t nmemb, size_t size,
			   int (*compar)(const void *, const void *))
{
	if (nmemb > 0) {
		size_t	pl = 0;							/* 探索範囲先頭の添字 */
		size_t	pr = nmemb - 1;					/* 探索範囲末尾の添字 */
		size_t	pc;								/* 探索範囲中央の添字 */
		char  	*x = (char *)base;

		while (1) {
			int	 comp = compar(key, (const void *)&x[(pc = (pl+pr)/2) * size]);

			if (comp == 0) { 				/* 探索成功 */
				for ( ; pc > pl; pc--)		/* keyと等しい先頭の要素を探す */
					if (compar((const void *)&x[(pc-1) * size], key))
						break;
				return (&x[pc * size]);
			} else if (pl == pr)				/* 探索範囲がなくなった */
				break;			
			else if (comp > 0)
				pl = pc + 1;					/* 探索範囲を後半に絞り込む */
			else
				pr = pc - 1;					/* 探索範囲を前半に絞り込む */
		}
	}
	return (NULL);							/* 探索失敗 */
}

#include  <stdio.h>

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

	printf("%d個の整数を昇順に入力してください。\n", nx);

	printf("x[0]：");
	scanf("%ld", &x[0]);

	for (i = 1; i < nx; i++) {
		do {
			printf("x[%d]：", i);
			scanf("%ld", &x[i]);
		} while (x[i] < x[i - 1]);	/* 一つ前の値よりも大きければ再入力 */
	}
	
	printf("探す値：");
	scanf("%ld", &ky);

	ptr = bsearchx(&ky, x, nx, sizeof(int), 
				(int (*)(const void *, const void*))int_cmp);

	if (ptr == NULL)
		puts("\a探索に失敗しました。");
	else
		printf("%dは%d番目にあります。\n", ky, ptr - x + 1);

	return (0);
}
