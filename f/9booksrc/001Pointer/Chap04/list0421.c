/*
	��������̕������P�������\��
*/

#include  <stdio.h>

int main(void)
{
	char  str[] = "ABC";	/* �z��ɂ�镶���� */
	char  *ptr	= "XYZ";	/* �|�C���^�ɂ�镶���� */

	printf("������str��\"");
	putchar(str[0]);
	putchar(str[1]);
	putchar(str[2]);
	puts("\"�ł��B");

	printf("������ptr��\"");
	putchar(ptr[0]);
	putchar(ptr[1]);
	putchar(ptr[2]);
	puts("\"�ł��B");

	return (0);
}