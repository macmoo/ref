/*
	�\���̂̃����o�ɒl��ǂݍ��ށi���̂Q�j
*/

#include  <stdio.h>

typedef struct {		/* ����f�[�^ */
	int	  no;			/* ����ԍ� */
	char  name[10];		/* ���@�@�� */
} Member;

int main(void)
{
	Member	m1;

	printf("����ԍ��F");	scanf("%d", &m1.no);		/* &�͕K�v */
	printf("���@�@���F");	scanf("%s", m1.name);		/* &�͕s�v */

	printf("����ԍ���%d\n", m1.no);
	printf("���@�@����%s\n", m1.name);

	return (0);
}
