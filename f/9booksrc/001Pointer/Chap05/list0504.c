/*
	�s�|�C���^�ɂ�镶����t�̔z��
*/

#include  <stdio.h>

int main(void)
{
	int	  i;
	char  *ptr[] = {"W140", "S", "500"};

	for (i = 0; i < 3; i++)
		printf("ptr[%d] = \"%s\"\n", i, ptr[i]);

	return (0);
}