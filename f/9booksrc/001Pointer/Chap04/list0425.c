/*
	�����񃊃e�������̕�����̏�������
*/

#include  <stdio.h>

int main(void)
{
	char  str[] = "ABC";	/* �z��ɂ�镶���� */
	char  *ptr	= "XYZ";	/* �|�C���^�ɂ�镶���� */

	str[1] = 'Q';			/* �n�j�I */
	ptr[1] = 'Q';			/* �\�H�\ */

	printf("������str��\"%s\"�ł��B\n", str);
	printf("������ptr��\"%s\"�ł��B\n", ptr);

	return (0);
}