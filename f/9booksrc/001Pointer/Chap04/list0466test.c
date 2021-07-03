/*
	memcpy関数・memmove関数の利用例
*/

#include  <stdio.h>
#include  <string.h>

/*--- memcpyの実現例 ---*/
void *memcpy(void *s1, const void *s2, size_t n)
{
	char		*p1 = (char *)s1;
	const char	*p2 = (const char *)s2;

	while (n-- > 0) {
		*p1 = *p2;
		p1++;
		p2++;
	}
	return (s1);
}

/*--- memmoveの実現例 ---*/
void *memmove(void *s1, const void *s2, size_t n)
{
	char		*p1 = (char *)s1;
	const char	*p2 = (const char *)s2;

	if (p1 < p2	 &&	 p1 < p2 + n)
		for (p1 += n, p1 += n; n > 0; n--)		/* 後ろからコピー */
			*p1-- = *p2--;
	else
		for ( ; n > 0; n--)						/* 前からコピー */
			*p1++ = *p2++;

	return (s1);
}

/*--- 配列bの要素をaに複写 ---*/
int arycpy(int a[], const int b[], int na)
{
	if (na < 0)						/* na＜0でなければならない */
		return (1);
	else {
		memcpy(a, b, na * sizeof(int)); 
		return (0);
	}
}

/*--- a[idx]にxを挿入して以降の要素を一つずつずらす ---*/
int aryins(int a[], int na, int idx, int x)
{
	if (idx < 0	 ||	 idx >= na)		/* 0≦idx＜naでなければならない */
		return (1);
	else {
		memmove(&a[idx + 1], &a[idx], (na - idx - 1) * sizeof(int)); 
		a[idx] = x;
		return (0);
	}
}

#define	MAX		5		/* 配列の要素数 */

int main(void)
{
	int	 i;
	int	 x[MAX] = {1, 2, 3, 4, 5};
	int	 y[MAX] = {9, 9, 9, 9, 9};

	arycpy(y, x, MAX);		/* xの全要素をyにコピー */

	aryins(x, MAX, 2, 10);	/* x[2]に10を挿入 */

	puts("        x   y ");
	puts("--------------");

	for (i = 0; i < MAX; i++)
		printf("[%d] :%4d%4d\n", i, x[i], y[i]);

	return (0);
}
