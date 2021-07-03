/*
	qsort�֐��𗘗p���Đ����z��̗v�f��l�̍~���Ƀ\�[�g
*/

#include  <stdio.h>
#include  <stdlib.h>

/*--- int�^�̔�r�֐��i�~���\�[�g�p�j ---*/
int int_rcmp(const int *a, const int *b)
{
	if (*a < *b)
		return (1);
	else if (*a > *b)
		return (-1);
	else
		return (0);
}

int main(void)
{
	int	 i;
	int	 x[10];
	int	 nx = sizeof(x) / sizeof(x[0]);
	
	printf("%d�̐�������͂���B\n", nx);
	for (i = 0; i < nx; i++) {
		printf("x[%d] : ", i);
		scanf("%d", &x[i]);
	}

	qsort(x, nx, sizeof(int),
			(int (*)(const void *, const void *))int_rcmp);

	puts("�~���Ƀ\�[�g���܂����B");
	for (i = 0; i < nx; i++)
		printf("x[%d] = %d\n", i, x[i]);

	return (0);
}