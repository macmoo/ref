/*
	���`�T��
*/

#include  <stdio.h>

/*--- �z��x�̐擪n�̗v�f����lno����`�T���i��P�Łj ---*/
int seq_search(int *x, int n, int no)
{
	int	 i;
	for (i = 0; i < n; i++)
		if (*x++ == no)			/* �T������ */
			return (i);
	return (-1);				/* �T�����s */
}

int main(void)
{
	int	 i, no, idx;
	int	 a[8];
	int	 a_size = sizeof(a) / sizeof(a[0]);		/* �z��a�̗v�f�� */

	for (i = 0; i < a_size; i++) {
		printf("a[%d]�F", i);		/* a[i]�̓��͂𑣂� */
		scanf("%d", &a[i]);
	}
	printf("�T���l�́F");
	scanf("%d", &no);

	if ((idx = seq_search(a, a_size, no)) != -1)
		printf("���̒l�����v�f��a[%d]�ł��B\n", idx);
	else
		puts("������܂���ł����B");

	return (0);
}