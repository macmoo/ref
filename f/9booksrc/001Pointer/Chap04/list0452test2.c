/*
	strpbrk�֐��̗��p��i���̂Q�j
*/

#include  <stdio.h>
#include  <string.h>

/*--- strpbrk�̎�����F<stddef.h>�̃C���N���[�h���K�v ---*/
char *strpbrk(const char *s1, const char *s2)
{
	for ( ; *s1; s1++) {
		const char	*t = s2;
		for ( ; *t; t++)
			if (*t == *s1)					/* ������ */
				return ((char *)s1);
	}
	return (NULL);
}

int main(void)
{
	char  str[80];
	char  ultr[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";	/* �p�啶�� */
	char  *p;

	printf("���������͂��Ă��������F");
	scanf("%s", str);

	puts("���̕����񂩂�p�啶���𒊏o���܂��B");

	p = str;						/* ������̐擪�������w�� */

	while ((p = strpbrk(p, ultr)) != NULL)
		putchar(*p++);

	return (0);
}