/* 演習9-2の解答例 */

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

/*--- 文字列の配列（n1×n2の２次元配列）を昇順にソート ---*/
void sort_2dstr(char *p, int n1, int n2)
{
	qsort(p, n1, n2, (int(*)(const void *, const void *))strcmp);
}

/*--- xおよびyが指す文字列の比較関数（x < y） ---*/
int pstrcmp(const void *x, const void *y)
{
	return (strcmp(*(const char **)x, *(const char **)y));
}

/*--- 文字列を指すポインタの配列pを昇順にソート ---*/
void sort_pvstr(char *p[], int n)
{
	qsort(p, n, sizeof(char *), pstrcmp);
}

int main(void)
{
	int	  i;
	char  s[][7] = {"LISP", "C", "Ada", "Pascal"};
	char  *p[]   = {"LISP", "C", "Ada", "Pascal"};
	
	sort_2dstr(&s[0][0], 4, 7);

	sort_pvstr(p, 4);

	puts("昇順にソートしました。");

	for (i = 0; i < 4; i++)
		printf("s[%d] = %s\n", i, s[i]);

	for (i = 0; i < 4; i++)
		printf("p[%d] = %s\n", i, p[i]);

	return (0);
}
