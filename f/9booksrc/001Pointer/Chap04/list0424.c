/*
	�|�C���^�ɕ����񃊃e�����̐擪�����ւ̃|�C���^����
*/

#include  <stdio.h>

int main(void)
{
	char  *ptr = "ABC";	/* �|�C���^�ɂ�镶���� */

	printf("������ptr��\"%s\"�ł��B\n", ptr);

	ptr = "XYZ";		/* ptr��"XYZ"�̐擪�����ւ̃|�C���^���� */

	printf("������ptr��\"%s\"�ł��B\n", ptr);

	return (0);
}