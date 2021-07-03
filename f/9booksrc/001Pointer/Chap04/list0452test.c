/*
	strpbrk�֐��̗��p��i���̂P�j
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
	char  s1[80], s2[80];
	char  *p;

	printf("������S1�F");	  scanf("%s", s1);
	printf("������S2�F");	  scanf("%s", s2);

	if ((p = strpbrk(s1, s2)) == NULL)
		printf("������S2���̂ǂ̕�����������S1���ɂ͑��݂��܂���B\n");
	else
		printf("������S2�Ɋ܂܂�镶���̕�����S1�ł̍ŏ��̏o���ȍ~��"
												"\"%s\"�ł��B\n", p);

	return (0);
}
