/*
	strtol�֐��̗��p��
*/

#include  <errno.h>
#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

int main(void)
{
	int	  retry;
	int	  base;
	long  x;
	char  str[60];
	char  *ptr = str;

	puts("��������͂��Ă��������B");

	do {
		printf("���i���F");	  scanf("%d", &base);
		printf("�����l�F");	  scanf("%s", str);

		x = strtol(str, &ptr, base);

		if (errno == ERANGE)
			puts("long�^�̕\���͈͂𒴂��Ă��܂��B");
		else {
			if (ptr == str)
				puts("�����ɕϊ��ł��܂���ł����B");
			else {
				printf("10�i����%d�ł��B\n", x);
				if (ptr != &str[strlen(str)])
					printf("%s�̕����͕ϊ��ł��܂���ł����B\n", ptr);
			}
		}

		printf("������x�i0�|�������^1�\�͂��j�F");
		scanf("%d", &retry);

	} while (retry == 1);

	return (0);
}
