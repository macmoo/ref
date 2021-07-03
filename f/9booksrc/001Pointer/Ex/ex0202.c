/* ‰‰K2-2‚Ì‰ğ“š—áimainŠÖ”“™‚ÍÈ—ªj */

/*--- ÀŒ»—á‚P ---*/
void ary_cpy(int a[], const int b[], int no)
{
	int	 i;

	for (i = 0; i < no; i++)
		a[i] = b[i];
}

/*--- ÀŒ»—á‚Q ---*/
void ary_cpy(int a[], const int b[], int no)
{
	while (no-- > 0)
		*a++ = *b++;
}
