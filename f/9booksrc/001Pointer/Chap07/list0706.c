/*
	���I�Ɋm�ۂ��������ɒl��ǂݍ���
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
		printf("��������͂��Ă��������F");
		scanf("%d",	p);						/* �l��ǂݍ��� */
		printf("*p�̒l��%d�ł��B\n", *p);
		free(p);							/* �m�ۂ��Ă����̈����� */
	}

	return (0);
}