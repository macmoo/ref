/* ���K2-2�̉𓚗�imain�֐����͏ȗ��j */

/*--- ������P ---*/
void ary_cpy(int a[], const int b[], int no)
{
	int	 i;

	for (i = 0; i < no; i++)
		a[i] = b[i];
}

/*--- ������Q ---*/
void ary_cpy(int a[], const int b[], int no)
{
	while (no-- > 0)
		*a++ = *b++;
}
