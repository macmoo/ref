/*
	�s�|�C���^�ɂ�镶����t�̔z����̕�������P�������������ĕ\��
*/

#include  <stdio.h>

int main(void)
{
	int	  i, j;
	char  *ptr[] = {"W140", "S", "500"};
	int	  np = sizeof(ptr) / sizeof(ptr[0]);	/* ptr�̗v�f�� */

	for (i = 0; i < np; i++) {
		printf("ptr[%d] = \"", i);
		for (j = 0; ptr[i][j] != '\0'; j++)
			putchar(ptr[i][j]);
		printf("\"\n");
	}

	return (0);
}