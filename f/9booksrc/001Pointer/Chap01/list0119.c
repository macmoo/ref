/*
	printf�֐���scanf�֐��̗��p��
*/

#include  <stdio.h>

int main(void)
{
	int	  i;
	long  k;
	char  s[20];

	printf("��������͂��Ă��������F");
	scanf("%d", &i);					/* &���K�v */

	printf("��������͂��Ă��������F");
	scanf("%ld", &k);					/* &���K�v */

	printf("���������͂��Ă��������F");
	scanf("%s", s);						/* ������̓Ǎ��݂ł�&���s�v */

	printf("���� i �̒l��%d�ł��B\n",  i);			/* &�͕s�v */
	printf("���� k �̒l��%ld�ł��B\n", k);			/* &�͕s�v */
	printf("������s�̒l��%s�ł��B\n",  s);			/* &�͕s�v */

	return (0);
}