/*
	�|�C���^���w���I�u�W�F�N�g�̒l��\��
*/

#include  <stdio.h>

int main(void)
{
	int	 nx;			/* nx��int�^ */
	int	 *pt;			/* pt��int *�^ */

	nx = 57;							/* nx�ɐ���57���� */
	pt = &nx;							/* pt��nx�̃A�h���X���� */

	printf(" nx�̒l��%d\n",	 nx);		/* nx�̒l��\�� */
	printf("*pt�̒l��%d\n", *pt);		/* pt���w���I�u�W�F�N�g�̒l��\�� */

	return (0);
}