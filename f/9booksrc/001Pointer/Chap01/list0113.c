/*
	�|�C���^�𐮐��l�ɕϊ����ĕ\��
*/

#include  <stdio.h>

int main(void)
{
	int	 nx;			/* nx��int�^ */
	int	 *pt = &nx;		/* pt��nx���w���|�C���^ */

	/* nx�ւ̃|�C���^�𕄍����������l�ɕϊ����ĕ\�� */
	printf("&nx�F%lu\n", (unsigned long)&nx);
	printf(" pt�F%lu\n", (unsigned long)pt);

	return (0);
}