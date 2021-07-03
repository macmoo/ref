/*
	�ėp���`�T���֐�
*/

#include  <stdlib.h>

/*--- base���w���v�f�̑傫����size�ŗv�f����nmemb�̔z�񂩂�key�ƈ�v����v�f��
	  ��r�֐�compar��p���Đ��`�T�� ---*/
void *seqsearch(const void *key, const void *base, size_t nmemb, size_t size,
			 	int (*compar)(const void *, const void *))
{
	size_t	i;
	char  	*x = (char *)base;

	for (i = 0; i < nmemb; i++)
		if (!compar(key, (const void *)&x[i * size]))
			return (&x[i * size]);						/* �T������ */
	return (NULL);										/* �T�����s */
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

	printf("%d�̐�������͂��Ă��������B\n", nx);

	printf("x[0]�F");
	scanf("%ld", &x[0]);

	for (i = 1; i < nx; i++) {
		printf("x[%d]�F", i);
		scanf("%ld", &x[i]);
	}
	
	printf("�T���l�F");
	scanf("%ld", &ky);

	ptr = seqsearch(&ky, x, nx, sizeof(int), 
				   (int (*)(const void *, const void*))int_cmp);

	if (ptr == NULL)
		puts("\a�T���Ɏ��s���܂����B");
	else
		printf("%d��%d�Ԗڂɂ���܂��B\n", ky, ptr - x + 1);

	return (0);
}
