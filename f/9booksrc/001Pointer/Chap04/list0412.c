/*
	������̒��������߂�i��P�Łj
*/

#include  <stdio.h>

/*--- ������s�̒��������߂� ---*/
unsigned str_length(const char s[])
{
	unsigned  len = 0;

	while (s[len] != '\0')
		len++;
	return (len);
}

int main(void)
{
	char  str[100];

	printf("���������͂��Ă��������F");
	scanf("%s", str);

	printf("������\"%s\"�̒�����%u�ł��B\n", str, str_length(str));

	return (0);
}