/*
	������̒��������߂�i��P�Łj
*/

#include  <stdio.h>

/*--- ������s�̒��������߂�i��Q�Łj ---*/
unsigned str_length(const char *s)
{
	unsigned  len = 0;

	for ( ; *s != '\0'; s++)
		len++;
	return (len);
}

int main(void)
{
	char  str[100];

	printf("���������͂��ĉ������F");
	scanf("%s", str);

	printf("������\"%s\"�̒�����%u�ł��B\n", str, str_length(str));

	return (0);
}