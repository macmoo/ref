/*
	�s�z��ɂ�镶����t�̔z��
*/

#include  <stdio.h>

int main(void)
{
	int	  i;
	char  ary[][5] = {"LISP", "C", "Ada"};

	for (i = 0; i < 3; i++)
		printf("ary[%d] = \"%s\"\n", i, ary[i]);

	return (0);
}