/*
	��������̕������P�������\������֐����Ăяo��
*/

#include  <stdio.h>

/*--- ������s��\�� ---*/
void put_str(const char *s)
{
	while (*s)
		putchar(*s++);
}

int main(void)
{
	char  str[] = "ABC";	/* �z��ɂ�镶���� */
	char  *ptr  = "XYZ";	/* �|�C���^�ɂ�镶���� */

	put_str(str);	putchar('\n');
	put_str(ptr);	putchar('\n');
	put_str("UVW");	putchar('\n');

	return (0);
}