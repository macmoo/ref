/*
	������̔�r
*/

#include  <stdio.h>
#include  <string.h>

int main(void)
{
	char  str[10];
	int	  cmp;

	printf("���������͂��Ă��������F");
	scanf("%s", str);

	cmp = strcmp(str, "ABC");			/* str��"ABC"���r */

	printf("���̕������\"ABC\"");
	
	if (cmp == 0)
		puts("�Ɠ������ł��B");
	else if (cmp > 0)
		puts("���傫���ł��B");
	else
		puts("��菬�����ł��B");

	return (0);
}