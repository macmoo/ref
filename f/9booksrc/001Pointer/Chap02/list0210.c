/*
	�z��̗v�f����\��
*/

#include  <stdio.h>

int main(void)
{
	int	 x[5];

	printf("x�̗v�f����%u�ł��B\n", (unsigned)(sizeof(x) / sizeof(x[0])));

	return (0);
}