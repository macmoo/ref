/*
	bsearch�֐��𗘗p���ėv�f��T��
*/

#include  <stdio.h>
#include  <stdlib.h>

/*--- �������r����֐� ---*/
int int_cmp(const int *a, const int *b)
{
	return (*a < *b ? -1 : *a > *b ? 1 : 0);
}

int main(void)
{
	int	 no, *p; 
	int	 x[10] = {1, 3, 15, 27, 31, 45, 51, 67, 69, 90};
	int	 nx = sizeof(x) / sizeof(x[0]);	/* x�̗v�f�� */
	
	printf("�T������l����͂���F");
	scanf("%d", &no);

	p = bsearch(&no, x, nx, sizeof(int),
							(int (*)(const void *, const void *))int_cmp);

	if (p != NULL)
		printf("x[%d]����v���܂��B\n", (int)(p - &x[0]));
	else
		puts("������܂���ł����B");

	return (0);
}