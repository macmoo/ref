/*
	�ėp�Q���T���֐��ibsearch�֐��ɏ������d�l�j
*/

#include  <stdlib.h>

/*--- �ėp�Q���T���֐��ibsearch�֐��ɏ������d�l�j ---*/
void *binsearch(const void *key, const void *base, size_t nmemb, size_t size,
			 	int (*compar)(const void *, const void *))
{
	if (nmemb > 0) {
		size_t	pl = 0;							/* �T���͈͐擪�̓Y�� */
		size_t	pr = nmemb - 1;					/* �T���͈͖����̓Y�� */
		size_t	pc;								/* �T���͈͒����̓Y�� */
		char  	*x = (char *)base;

		while (1) {
			int	 comp = compar(key, (const void *)&x[(pc = (pl+pr)/2) * size]);

			if (comp == 0)	 					/* �T������ */
				return (&x[pc * size]);
			else if (pl == pr)					/* �T���͈͂��Ȃ��Ȃ��� */
				break;			
			else if (comp > 0)
				pl = pc + 1;					/* �T���͈͂��㔼�ɍi�荞�� */
			else
				pr = pc - 1;					/* �T���͈͂�O���ɍi�荞�� */
		}
	}
	return (NULL);							/* �T�����s */
}

#include <stdio.h>

/*--- int�^�������r����֐� ---*/
int int_cmp(const int *a, const int *b)
{
	if (*a < *b)
		return (-1);
	else if (*a > *b)
		return (1);
	else
		return (0);
}

int main(void)
{
	int	 i, ky, idx;
	int	 x[7];
	int *ptr;
	int	 nx = sizeof(x) / sizeof(x[0]);

	printf("%d�̐����������ɓ��͂��Ă��������B\n", nx);

	printf("x[0]�F");
	scanf("%ld", &x[0]);

	for (i = 1; i < nx; i++) {
		do {
			printf("x[%d]�F", i);
			scanf("%ld", &x[i]);
		} while (x[i] < x[i - 1]);	/* ��O�̒l�����傫����΍ē��� */
	}
	
	printf("�T���l�F");
	scanf("%ld", &ky);

	ptr = binsearch(&ky, x, nx, sizeof(int), 
				   (int (*)(const void *, const void*))int_cmp);

	if (ptr == NULL)
		puts("\a�T���Ɏ��s���܂����B");
	else
		printf("%d��%d�Ԗڂɂ���܂��B\n", ky, ptr - x + 1);

	return (0);
}
