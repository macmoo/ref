/*
	strspn�֐���strcspn�֐��̗��p��
*/

#include  <stdio.h>
#include  <string.h>

/*--- strspn�̎�����F<stddef.h>�̃C���N���[�h���K�v ---*/
size_t strspn(const char *s1, const char *s2)
{
	const char	*p = s1;

	for ( ; *s1; s1++) {
		const char	*t;

		for (t = s2; *t != *s1; t++)
			if (*t == '\0')
				return (s1 - p);
	}
	return (s1 - p);
}

/*--- strcspn�̎�����F<stddef.h>�̃C���N���[�h���K�v ---*/
size_t strcspn(const char *s1, const char *s2)
{
	const char	*p = s1;

	for ( ; *s1; s1++) {
		const char	*t;

		for (t = s2; *t; t++)
			if (*t == *s1)
				return (s1 - p);
	}
	return (s1 - p);
}

int main(void)
{
	char  str[60];		/* ���̕����񂩂�T�� */
	char  ltr[] = "ABCDEFGHIJKLMNOPQRSTUVWXYXabcdefghijklmnopqrstuvwxyz";
	unsigned  n1, n2;

	printf("���������͂��Ă��������F");
	scanf("%s", str);

	n1 = strspn( str, ltr);		/* �擪�@�p�����̕����� */
	n2 = strcspn(str, ltr);		/* �擪��p�����̕����� */

	if (n1 == 0)
		printf("�擪�͉p���ł͂���܂���B\n");
	else
		printf("�擪%u�������p������\������Ă��܂��B\n", n1);

	if (n2 == 0)
		printf("�擪�͉p���ł��B\n");
	else
		printf("�擪%u�����ɂ͉p���͊܂܂�Ă��܂���B\n", n2);

	return (0);
}
