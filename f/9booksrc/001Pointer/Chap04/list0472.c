/*
	strtod�֐��̗��p��
*/

#include  <errno.h>
#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

int main(void)
{
	double	x;
	char	str[60];
	char	*ptr = str;

	printf("��������͂��Ă��������F");
	scanf("%s", str);

	x = strtod(str, &ptr);

	if (errno == ERANGE)
		puts("double�^�̕\���͈͂𒴂��Ă��܂��B");
	else {
		if (ptr == str)
			puts("���������_���ɕϊ��ł��܂���ł����B");
		else {
			printf("���̒l��%f�ł��B\n", x);
			if (ptr != &str[strlen(str)])
				printf("%s�̕����͕ϊ��ł��܂���ł����B\n", ptr);
		}
	}

	return (0);
}