/*
	�ėp�N�C�b�N�\�[�g�iqsort�֐��ɏ������d�l�j
*/

#include  <stdlib.h>

/*--- x, y�̎w��n�o�C�g�̗̈������ ---*/
static void memswap(void *x, void *y, size_t n)
{
	unsigned char  *a = (unsigned char *)x;
	unsigned char  *b = (unsigned char *)y;

	for ( ; n--; a++, b++) {
		unsigned char  c = *a;
		*a = *b;
		*b = c;
	}
}

/*--- �ėp�N�C�b�N�\�[�g�iqsort�֐��ɏ������d�l�j ---*/
void quick(void *base, size_t nmemb, size_t size,
		   int (*compar)(const void *, const void *))
{
	if (nmemb > 0) {
		size_t	pl = 0;					/* ���J�[�\�� */
		size_t	pr = nmemb - 1;			/* �E�J�[�\�� */
		char	*v = (char *)base;
		char	*x = &v[((pl + pr) / 2) * size];	/* �����͒����̗v�f */

		do {
			while (compar((const void *)&v[pl * size], x) < 0) pl++;
			while (compar((const void *)&v[pr * size], x) > 0) pr--;
			if (pl <= pr) {
				memswap(&v[pl * size], &v[pr * size], size);
				pl++;
				if (pr == 0)	/* ������������0����̃f�N�������g������� */
					goto QuickRight;
				pr--;
			}
		} while (pl <= pr);

		if (0  < pr)  	  quick(&v[0], 		   pr + 1,	   size, compar);
	QuickRight:
		if (pl < nmemb-1) quick(&v[pl * size], nmemb - pl, size, compar);
	}
}

#include  <stdio.h>
	
/*--- int�^�̔�r�֐��i�����\�[�g�p�j ---*/
int int_cmp(const int *a, const int *b)
{
	if (*a > *b)
		return (1);
	else if (*a < *b)
		return (-1);
	else
		return (0);
}

int main(void)
{
	int	 i;
	int	 x[7];
	int	 nx = sizeof(x) / sizeof(x[0]);

	printf("%d�̐�������͂���B\n", nx);
	for (i = 0; i < nx; i++) {
		printf("x[%d] : ", i);
		scanf("%d", &x[i]);
	}

	qsort(x,											/* �z�� */
		  nx,											/* �v�f�� */
		  sizeof(int),									/* �v�f�̑傫�� */
		  (int (*)(const void *, const void *))int_cmp	/* ��r�֐� */
		 );

	puts("�����Ƀ\�[�g���܂����B");
	for (i = 0; i < nx; i++)
		printf("x[%d] = %d\n", i, x[i]);

	return (0);
}

