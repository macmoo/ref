/*
	�z��̐擪�O�̗v�f�����v
*/

#include  <stdio.h>

/*--- �z��̐擪�O�̗v�f�̍��v��Ԃ� ---*/
int sum123(const int *a)
{
	return (a[0] + a[1] + a[2]);
}

int main(void)
{
	int	 x[5] = {1, 3, 5, 7, 9};	/* �v�f�^��int�^�ŗv�f����5�̔z�� */

	printf("x[0] + x[1] + x[2] = %d\n", sum123(x));

	return (0);
}