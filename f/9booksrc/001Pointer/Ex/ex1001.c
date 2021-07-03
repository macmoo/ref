/* ���K10-1�̉𓚗� */

#include  <stdio.h>
#include  <stdarg.h>
#include  <string.h>

/*--- �󕶎���܂��͋�|�C���^���O�̑S�����̕������A�� ---*/
char *strxcat(char *s, ...)
{
	char	 *p = s;
	char	 *str;
	va_list	 ap;

	va_start(ap, s);			/* �ό����A�N�Z�X�J�n */

	while (*s)					/* ��P������̖����Ƀ|�C���^���ړ� */
		s++;

	while ((str = va_arg(ap, char *)) != NULL  &&  *str != '\0') {
		while (*str)
			*s++ = *str++;
	}
	*s = '\0';					/* ������̏I�[ */

	va_end(ap);					/* �ό����A�N�Z�X�I�� */

	return (p);
}

int main(void)
{
	char  s[100] = "ABC";

	printf("%s\n", strxcat(s, ""));
	printf("%s\n", strxcat(s, NULL));
	printf("%s\n", strxcat(s, "123", "456", ""));
	printf("%s\n", strxcat(s, "KGB", "FBI", NULL));

	return (0);
}
