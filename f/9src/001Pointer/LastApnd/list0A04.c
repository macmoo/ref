/*
	汎用クイックソート（qsort関数に準じた仕様）
*/

#include  <stdlib.h>

/*--- x, yの指すnバイトの領域を交換 ---*/
static void memswap(void *x, void *y, size_t n)
{
	unsigned char  *a = (unsigned char *)x;
	unsigned char  *b = (unsigned char *)y;

	for ( ; n--; a++, b++) {
		unsigned char  c = *a;
		*a = *b;
		*b = c;
	}
}

/*--- 汎用クイックソート（qsort関数に準じた仕様） ---*/
void quick(void *base, size_t nmemb, size_t size,
		   int (*compar)(const void *, const void *))
{
	if (nmemb > 0) {
		size_t	pl = 0;					/* 左カーソル */
		size_t	pr = nmemb - 1;			/* 右カーソル */
		char	*v = (char *)base;
		char	*x = &v[((pl + pr) / 2) * size];	/* 枢軸は中央の要素 */

		do {
			while (compar((const void *)&v[pl * size], x) < 0) pl++;
			while (compar((const void *)&v[pr * size], x) > 0) pr--;
			if (pl <= pr) {
				memswap(&v[pl * size], &v[pr * size], size);
				pl++;
				if (pr == 0)	/* 符号無し整数0からのデクリメントを避ける */
					goto QuickRight;
				pr--;
			}
		} while (pl <= pr);

		if (0  < pr)  	  quick(&v[0], 		   pr + 1,	   size, compar);
	QuickRight:
		if (pl < nmemb-1) quick(&v[pl * size], nmemb - pl, size, compar);
	}
}

#include  <stdio.h>
	
/*--- int型の比較関数（昇順ソート用） ---*/
int int_cmp(const int *a, const int *b)
{
	if (*a > *b)
		return (1);
	else if (*a < *b)
		return (-1);
	else
		return (0);
}

int main(void)
{
	int	 i;
	int	 x[7];
	int	 nx = sizeof(x) / sizeof(x[0]);

	printf("%d個の整数を入力せよ。\n", nx);
	for (i = 0; i < nx; i++) {
		printf("x[%d] : ", i);
		scanf("%d", &x[i]);
	}

	qsort(x,											/* 配列 */
		  nx,											/* 要素数 */
		  sizeof(int),									/* 要素の大きさ */
		  (int (*)(const void *, const void *))int_cmp	/* 比較関数 */
		 );

	puts("昇順にソートしました。");
	for (i = 0; i < nx; i++)
		printf("x[%d] = %d\n", i, x[i]);

	return (0);
}

