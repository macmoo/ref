/* K2-2ΜπαimainΦΝΘͺj */

/*--- ΐ»αP ---*/
void ary_cpy(int a[], const int b[], int no)
{
	int	 i;

	for (i = 0; i < no; i++)
		a[i] = b[i];
}

/*--- ΐ»αQ ---*/
void ary_cpy(int a[], const int b[], int no)
{
	while (no-- > 0)
		*a++ = *b++;
}
