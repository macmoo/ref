/*
	�������\��
*/

#include  <stdio.h>

/*--- ������s��\�� ---*/
void put_str(const char *s)
{
	while (*s)
		putchar(*s++);
}

int main(void)
{
	char  str[100];

	printf("���������͂��Ă��������F");
	scanf("%s", str);

	put_str(str);
	putchar('\n');

	return (0);
}