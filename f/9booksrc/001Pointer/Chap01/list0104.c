/*
	�|�C���^��ʂ��ĊԐړI�ɃI�u�W�F�N�g�ɒl����
*/

#include  <stdio.h>

int main(void)
{
	int	 nx, ny;
	int	 *p;

	p  = &nx;	/* p��nx�̃A�h���X�����Fp��nx���w�� */
	*p = 100;	/* p���w��nx��100���� */

	p  = &ny;	/* p��ny�̃A�h���X�����Fp��ny���w�� */
	*p = 300;	/* p���w��ny��300���� */

	printf("nx�̒l��%d\n", nx);
	printf("ny�̒l��%d\n", ny);

	return (0);
}