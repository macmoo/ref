/*
	�����P���̋L����𓮓I�Ɋm�ہimalloc�֐��𗘗p�j
*/

#include  <stdio.h>
#include  <stdlib.h>

int main(void)
{
	int	 *p;

	p = (int *)malloc(sizeof(int));			/* �������P���I�Ɋm�� */

	if (p == NULL)
		puts("�L����̊m�ۂɎ��s���܂����B");
	else
		printf("*p�̒l��%d�ł��B\n", *p);

	return (0);
}