/* ���K7-2�̉𓚗� */

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

void *recalloc(void *ptr, size_t size, size_t old_size)
{
	void  *tmp;

	if (size == 0)
		return (NULL);
	tmp = realloc(ptr, size);
	if (tmp != NULL  &&  size > old_size)
		memset((char *)tmp + old_size, 0, (size - old_size));

	return (tmp);
}

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

		printf("�v�f���������ɕύX���܂����F");
		scanf("%d", &n2);

		/* �v�f����n2�ɕύX */
		temp = (int *)recalloc(p, n2 * sizeof(int), no * sizeof(int));

		if (temp == NULL)
			puts("�̈�̑傫���̕ύX�Ɏ��s���܂����B");
		else {
			p = temp;

			for (i = 0; i < n2; i++)		/* �S�v�f�̒l��\�� */
				printf("p[%d] = %d\n", i, p[i]);
		}
		free(p);							/* �m�ۂ��Ă����̈����� */
	}
	return (0);
}
