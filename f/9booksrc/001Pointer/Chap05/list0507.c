/*
	�s�|�C���^�ɂ�镶����t�̔z����̕������\���i�֐��Łj
*/

#include  <stdio.h>

/*--- �|�C���^�ɂ�镶����str[n]��\�� ---*/
void print_pname(const char *str[], int n)
{
	printf("str[%d] = \"%s\"\n", n, str[n]);
}	

int main(void)
{
	int	  i;
	char  *ptr[] = {"W140", "S", "500"};
	int	  np = sizeof(ptr) / sizeof(ptr[0]);	/* ptr�̗v�f�� */

	for (i = 0; i < np; i++)
		print_pname(ptr, i);

	return (0);
}