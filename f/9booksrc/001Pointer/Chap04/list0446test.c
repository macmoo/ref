/*
	strcmp�֐���strncmp�֐��̗��p��
*/

#include  <stdio.h>
#include  <string.h>

/*--- strcmp�̎����� ---*/
int strcmp(const char *s1, const char *s2)
{
	while (*s1 == *s2) {
		if (*s1 == '\0')			/* ������ */
			return (0);
		s1++;
		s2++;
	}
	return ((unsigned char)*s1 - (unsigned char)*s2);
}

/*--- strncmp�̎����� ---*/
int strncmp(const char *s1, const char *s2, size_t n)
{
	while (n && *s1 && *s2) {
		if (*s1 != *s2)			/* �������Ȃ� */
			return ((unsigned char)*s1 - (unsigned char)*s2);
		s1++;
		s2++;
		n--;
	}
	if (!n)	 return (0);
	if (*s1) return (1);
	return (-1);
}

int main(void)
{
	int	  cmp1, cmp2;
	char  st[100];

	puts("\"ABCDE\"�Ƃ̔�r���s���܂��B");
	puts("\"XXXXX\"�ŏI�����܂��B");

	while (1) {
		printf("\n������st�F");
		scanf("%s", st);

		if (strcmp(st, "XXXXX") == 0)
			break;
		printf("strcmp( \"ABCDE\", st)    = %d\n", strcmp( "ABCDE", st));
		printf("strncmp(\"ABCDE\", st, 3) = %d\n", strncmp("ABCDE", st, 3));
	}

	return (0);
}
