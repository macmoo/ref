/*
	strcmp�֐���strncmp�֐��̗��p��
*/

#include  <stdio.h>
#include  <string.h>

int main(void)
{
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