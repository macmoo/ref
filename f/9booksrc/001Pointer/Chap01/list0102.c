/*
	�����̒l�ƃ|�C���^�̒l��\��
*/

#include  <stdio.h>

int main(void)
{
	int	 nx;			/* nx��int�^�i�����j */
	int	 *pt;			/* pt��int *�^�i�|�C���^�j */

	nx = 57;							/* nx��57���� */
	pt = &nx;							/* pt��nx�̃A�h���X���� */

	printf(" nx�̒l��%d\n",	 nx);		/* nx�̒l��\�� */
	printf("&nx�̒l��%p\n", &nx);		/* nx�̃A�h���X��\�� */
	printf(" pt�̒l��%p\n",	 pt);		/* pt�̒l��\�� */

	return (0);
}