/*
	�����P���̋L����𓮓I�Ɋm��
*/

#include  <stdio.h>
#include  <stdlib.h>

int main(void)
{
	int	 *p;

	p = (int *)calloc(1, sizeof(int));		/* �������P���I�Ɋm�� */

	if (p == NULL)
		puts("�L����̊m�ۂɎ��s���܂����B");
	else {
		*p = 15;
		printf("*p = %d\n", *p);
	}

	return (0);
}
