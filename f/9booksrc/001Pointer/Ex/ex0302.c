/* ���K3-2�̉𓚗� */

#include  <stdio.h>

int main(void)
{
	int	 x[3][2][4];

	printf("�z��x��%d�~%d�~%d�̂R�����z��ł��B\n",
				(int)(sizeof(x)       / sizeof(x[0])),
				(int)(sizeof(x[0])    / sizeof(x[0][0])),
				(int)(sizeof(x[0][0]) / sizeof(x[0][0][0])));

	return (0);
}
