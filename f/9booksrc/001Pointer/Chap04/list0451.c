/*
	strchr�֐���strrchr�֐��̗��p��
*/

#include  <stdio.h>
#include  <string.h>

int main(void)
{
	char  str[60];		/* ���̕����񂩂�T�� */
	char  tmp[60];
	int	  ch;			/* �T������ */
	char  *p;

	printf("���������͂��Ă��������F");
	scanf("%s", str);

	printf("�T�������́F");
	scanf("%s", tmp);			/* �������񕶎���Ƃ��ēǂݍ���� */
	ch = tmp[0];				/* ���̍ŏ��̕�����T�������Ƃ��� */

	if ((p = strchr(str, ch)) == NULL)				/* �擪�̏o����T�� */
		printf("����'%c'�͕����񒆂ɑ��݂��܂���B\n", ch);
	else {
		printf("����'%c'�̍ŏ��̏o���ȍ~��\"%s\"�ł��B\n", ch, p);

		p = strrchr(str, ch);						/* �����̏o����T�� */

		printf("����'%c'�̍Ō�̏o���ȍ~��\"%s\"�ł��B\n", ch, p);
	}

	return (0);
}
