/*
	strstr�֐��̗��p��
*/

#include  <stdio.h>
#include  <string.h>

/*--- strstr�̎�����a�F<stddef.h>�̃C���N���[�h���K�v ---*/
char *strstr(const char *s1, const char *s2)
{
	const char	*p1 = s1;
	const char	*p2 = s2;

	while (*p1	&&	*p2) {
		if (*p1 == *p2) {
			p1++;
			p2++;
		} else {
			p1 -= p2 - s2 - 1;
			p2 = s2;
		}
	}
	return (*p2 ? NULL : (char *)(p1 - (p2 - s2)));
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