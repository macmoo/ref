/*
	qsort関数を利用して整数配列の要素を値の降順にソート
*/

#include  <stdio.h>
#include  <stdlib.h>

/*--- int型の比較関数（降順ソート用） ---*/
int int_rcmp(const int *a, const int *b)
{
	if (*a < *b)
		return (1);
	else if (*a > *b)
		return (-1);
	else
		return (0);
}

int main(void)
{
	int	 i;
	int	 x[10];
	int	 nx = sizeof(x) / sizeof(x[0]);
	
	printf("%d個の整数を入力せよ。\n", nx);
	for (i = 0; i < nx; i++) {
		printf("x[%d] : ", i);
		scanf("%d", &x[i]);
	}

	qsort(x, nx, sizeof(int),
			(int (*)(const void *, const void *))int_rcmp);

	puts("降順にソートしました。");
	for (i = 0; i < nx; i++)
		printf("x[%d] = %d\n", i, x[i]);

	return (0);
}