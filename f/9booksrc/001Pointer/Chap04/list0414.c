/*
	������̒��������߂�i��P�Łj
*/

#include  <stdio.h>

/*--- ������s�̒��������߂�i��R�Łj ---*/
unsigned str_length(const char *s)
{
	const char	*p = s;

	while (*s)
		s++;
	return (s - p);
}

int main(void)
{
	char  str[100];

	printf("���������͂��ĉ������F");
	scanf("%s", str);

	printf("������\"%s\"�̒�����%u�ł��B\n", str, str_length(str));

	return (0);
}