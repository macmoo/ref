/*
	int�^�̔z��𓮓I�Ɋm��
*/

#include  <stdio.h>
#include  <stdlib.h>

int main(void)
{
	int	 no;		/* �z��̗v�f�� */
	int	 *p;

	printf("�m�ۂ���z��̗v�f���F");
	scanf("%d", &no);

	p = (int *)calloc(no, sizeof(int));		/* ������no���I�Ɋm�� */

	if (p == NULL)
		puts("�L����̊m�ۂɎ��s���܂����B");
	else {
		int	 i;

		for (i = 0; i < no; i++)			/* �S�v�f�ɓY���Ɠ����l���� */
			p[i] = i;
		for (i = 0; i < no; i++)			/* �S�v�f�̒l��\�� */
			printf("p[%d] = %d\n", i, p[i]);

		free(p);							/* �m�ۂ��Ă����̈����� */
	}

	return (0);
}