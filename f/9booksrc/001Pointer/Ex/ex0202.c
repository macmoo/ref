/* 演習2-2の解答例（main関数等は省略） */

/*--- 実現例１ ---*/
void ary_cpy(int a[], const int b[], int no)
{
	int	 i;

	for (i = 0; i < no; i++)
		a[i] = b[i];
}

/*--- 実現例２ ---*/
void ary_cpy(int a[], const int b[], int no)
{
	while (no-- > 0)
		*a++ = *b++;
}
