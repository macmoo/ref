/*
	memset�֐��̗��p��i���̂Q�j
*/

#include  <stdio.h>
#include  <string.h>

/*--- �v�f�^��int�^�ŗv�f��no�̔z��a�̑S�v�f��0���� ---*/
void fill_ary0(int a[], int no)
{
	if (no > 0)
		memset(a, 0, no * sizeof(int));
}

int main(void)
{
	int	 i;
	int	 x[] = {1, 2, 3, 4, 5};
	int	 nx = sizeof(x) / sizeof(x[0]);

	for (i = 0; i < nx; i++)
		printf("nx[%d] = %d\n", i, x[i]);

	fill_ary0(x, nx);		/* �z��x�̑S�v�f��0���� */

	puts("�S�v�f��0�������܂����B");

	for (i = 0; i < nx; i++)
		printf("nx[%d] = %d\n", i, x[i]);

	return (0);
}
