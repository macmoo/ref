/*
	�z��ƃ|�C���^�̑傫����\��
*/

#include  <stdio.h>

/*--- �󂯎�����|�C���^�̑傫����\�� ---*/
void func(int a[])
{
	printf("sizeof(a) = %u\n", (unsigned)sizeof(a));	/* �|�C���^ */
}

int main(void)
{
	int	 x[5];

	printf("sizeof(x) = %u\n", (unsigned)sizeof(x));	/* �z�� */
	func(x);

	return (0);
}