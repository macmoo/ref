/*
	strstr�֐��̗��p��
*/

#include  <stdio.h>
#include  <string.h>

/*--- strstr�̎�����`�F<string.h>�̃C���N���[�h���K�v ---*/
char *strstr(const char *s1, const char *s2)
{
	if (*s2 == '\0') return ((char *)s1);		/* s2�͋󕶎��� */

	for ( ; (s1 = strchr(s1, *s2)) != NULL; ++s1) {		/* strchr�𗘗p */
		const char	*sc1 = s1;
		const char	*sc2 = s2;

		do {
			if (*++sc2 == '\0')
				return ((char *)s1);
		} while (*++sc1 == sc2);
	}

	return (NULL);
}

int main(void)
{
	int	  i;
	char  s1[80], s2[80];
	char  *p;

	printf("������S1�F");	scanf("%s", s1);
	printf("������S2�F");	scanf("%s", s2);

	p = strstr(s1, s2);

	if (p == NULL)
		printf("������S1���ɂ͕�����S2�͑��݂��܂���B\n");
	else {
		int	 ofs = p - s1;
		printf("\n%s\n",  s1);				/* XXXABCDXXXXXXXXX	��\�� */
		printf("%*s|\n",  ofs, "");			/*	  |				��\�� */
		printf("%*s%s\n", ofs, "", s2);		/*	  ABCD			��\�� */
	}

	return (0);
}