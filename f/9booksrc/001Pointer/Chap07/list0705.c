/*
	�����P���̋L����𓮓I�Ɋm�ہi�g���I����������j
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
		free(p);							/* �m�ۂ��Ă����̈����� */
	}

	return (0);
}