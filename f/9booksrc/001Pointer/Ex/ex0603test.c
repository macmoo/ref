/* ���K6-3�̉𓚗� */

#include  <stdio.h>

typedef struct {		/* ����f�[�^ */
	int	  no;			/* ����ԍ� */
	char  name[10];		/* ���@�@�� */
} Member;

void getMember(Member *p)
{
	printf("����ԍ��F");	scanf("%d", &p->no);		/* &�͕K�v */
	printf("���@�@���F");	scanf("%s", p->name);		/* &�͕s�v */
}

int main(void)
{
	Member	m1;

	getMember(&m1);

	printf("����ԍ���%d\n", m1.no);
	printf("���@�@����%s\n", m1.name);

	return (0);
}
