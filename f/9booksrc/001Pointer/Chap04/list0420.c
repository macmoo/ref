/*
	������̎����@
*/

#include  <stdio.h>

int main(void)
{
	char  str[] = "ABC";	/* str�̊e�v�f�̒l��'A','B','C','\0' */
	char  *ptr	= "XYZ";	/* ptr��"XYZ"���w�� */

	printf("������str��\"%s\"�ł��B\n", str);
	printf("������ptr��\"%s\"�ł��B\n", ptr);

	return (0);
}