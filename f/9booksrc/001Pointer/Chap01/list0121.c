/*
	�|�C���^�̎w���ϐ��Ɏ����l��ǂݍ���ŕ\��
*/

#include  <stdio.h>

int main(void)
{
	double	nx;
	double	*pt = &nx;		/* pt��nx���w�� */

	printf("�����l����͂��Ă��������F");
	scanf("%lf", pt);		/* �ǂݍ��񂾒l��pt���w���ϐ��Ɋi�[ */

	printf("���Ȃ���%.2f�Ɠ��͂��܂����ˁB\n", *pt);

	return (0);
}