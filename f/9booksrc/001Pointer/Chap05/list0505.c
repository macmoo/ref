/*
	�s�|�C���^�ɂ�镶����t�̔z����̕������\��
*/

#include  <stdio.h>

int main(void)
{
	int	  i;
	char  *ptr[] = {"W140",
					"S",
					"500"
					"V8"};
	int	  np = sizeof(ptr) / sizeof(ptr[0]);	/* ptr�̗v�f�� */

	for (i = 0; i < np; i++)
		printf("ptr[%d] = \"%s\"\n", i, ptr[i]);

	return (0);
}