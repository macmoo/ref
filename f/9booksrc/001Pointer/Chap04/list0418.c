/*
	��������R�s�[�i��R�Łj
*/

#include  <stdio.h>

/*--- ������s��d�ɃR�s�[�i��R�Łj ---*/
char *str_copy(char *d, const char *s)
{
	char  *p = d;

	while (*d++ = *s++)
		;
	return (p);
}

int main(void)
{
	char  tmp[100];
	char  st1[100], st2[100], st3[100];

	printf("���������͂��Ă��������F");
	scanf("%s", tmp);

	/* st1�ɃR�s�[�����������st2�ɂ��R�s�[ */
	str_copy(st1, str_copy(st2, tmp));	

	printf("������st1��\"%s\"�ł��B\n", st1);
	printf("������st2��\"%s\"�ł��B\n", st2);
	printf("������st3��\"%s\"�ł��B\n", str_copy(st3, tmp));

	return (0);
}