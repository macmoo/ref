/*
	�Q�����z��̔z��a��&a[0]�ł���&a[0][0]�łȂ����Ƃ��m�F
*/

#include  <stdio.h>

int main(void)
{
	int	 a[2][3];

	printf("sizeof(*a)		= %u\n", (unsigned)sizeof(*a));
	printf("sizeof(a[0])	= %u\n", (unsigned)sizeof(a[0]));
	printf("sizeof(a[0][0])	= %u\n", (unsigned)sizeof(a[0][0]));

	return (0);
}