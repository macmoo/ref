/*
	�I�u�W�F�N�g�̒l�ƃA�h���X��\��
*/

#include  <stdio.h>

int main(void)
{
	int	 nx = 15;		/* nx��int�^ */
	int	 ny = 73;		/* ny��int�^ */

	printf("nx�̒l��%d\n", nx);				/* nx�̒l��\�� */
	printf("ny�̒l��%d\n", ny);				/* ny�̒l��\�� */

	printf("nx�̃A�h���X��%p\n", &nx);		/* nx�̃A�h���X��\�� */
	printf("ny�̃A�h���X��%p\n", &ny);		/* ny�̃A�h���X��\�� */

	return (0);
}