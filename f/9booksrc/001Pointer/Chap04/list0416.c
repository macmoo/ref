/*
	��������R�s�[�i��P�Łj
*/

#include  <stdio.h>

/*--- ������s��d�ɃR�s�[�i��P�Łj ---*/
void str_copy(char d[], const char s[])
{
	int	 i = 0;

	while ((d[i] = s[i]) != '\0')
		i++;
}

int main(void)
{
	char  str[100] = "ABC";
	char  tmp[100];

	printf("������str��\"%s\"�ł��B\n", str);
	printf("�R�s�[���镶�������͂��Ă��������F");
	scanf("%s", tmp);

	str_copy(str, tmp);		/* ������tmp��str�ɃR�s�[ */

	printf("������str��\"%s\"�ł��B\n", str);

	return (0);
}