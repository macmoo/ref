/*
	�����Ԃ���������񃊃e�����֏�����
*/

#include  <stdio.h>

int main(void)
{
	char  *ptr1 = "ABC";
	char  *ptr2 = "ABC";

	ptr2[1] = 'Z';

	printf("������ptr1��\"%s\"�ł��B\n", ptr1);
	printf("������ptr2��\"%s\"�ł��B\n", ptr2);

	return (0);
}