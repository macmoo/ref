/*
	�Q�����z��̗v�f����\��
*/

#include  <stdio.h>

int main(void)
{
	int	 x[4][3];

	printf("�z��x��%d�~%d�̂Q�����z��ł��B\n",
								(int)(sizeof(x)	   / sizeof(x[0])),
								(int)(sizeof(x[0]) / sizeof(x[0][0])));
	return (0);
}