/*
	strchr�֐���strrchr�֐��̗��p��
*/

#include  <stdio.h>
#include  <string.h>

/*--- strchr�̎�����F<stddef.h>�̃C���N���[�h���K�v ---*/
char *strchr(const char *s, int c)
{
	c = (char)c;
	while (*s != c) {
		if (*s == '\0')				/* �����邱�Ƃ��ł��Ȃ����� */
			return (NULL);
		s++;
	}
	return ((char *)s);
}

/*--- strrchr�̎�����F<stddef.h>�̃C���N���[�h���K�v ---*/
char *strrchr(const char *s, int c)
{
	const char	*p = NULL;			/* �o���ʒu */

	c = (char)c;
	while (1) {
		if (*s == c)				/* ������ */
			p = s;
		if (*s == '\0')				/*	�����I�� */
			break;
		s++;
	}
	return ((char *)p);
}

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
