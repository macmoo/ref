/*
	�����̔z��ɕ����񃊃e�����̐擪�����ւ̃|�C���^����
*/

#include  <stdio.h>

int main(void)
{
	char  str[4] = "ABC";	/* �z��ɂ�镶���� */

	printf("������str��\"%s\"�ł��B\n", str);

	str = "XYZ";					/* �G���[�F�z��ւ̑���͕s�� */

	printf("������str��\"%s\"�ł��B\n", str);

	return (0);
}