/*
	�m�ۂ����̈�̑傫����ύX�i���ǔŁj
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
		int	 i, n2;
		int	 *temp;

		for (i = 0; i < no; i++)			/* �S�v�f�ɓY���Ɠ����l���� */
			p[i] = i;

		printf("�v�f���������ɕύX���܂����F");
		scanf("%d", &n2);

		temp = (int *)realloc(p, n2 * sizeof(int));	/* �v�f����n2�ɕύX */

		if (temp == NULL)
			puts("�̈�̑傫���̕ύX�Ɏ��s���܂����B");
		else {
			p = temp;
			for (i = no; i < n2; i++)	/* �������v�f�ɓY���Ɠ����l���� */
				p[i] = i;

			for (i = 0; i < n2; i++)		/* �S�v�f�̒l��\�� */
				printf("p[%d] = %d\n", i, p[i]);
		}
		free(p);							/* �m�ۂ��Ă����̈����� */
	}
	return (0);
}