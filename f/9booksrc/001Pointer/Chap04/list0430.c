/*
	�������A������v���O����
*/

#include  <stdio.h>
#include  <string.h>

int main(void)
{
	char  s[15] = "I love ";

	strcat(s, "you.");			/* s��"you."��A�� */

	printf("������s��\"%s\"�ł��B\n", s);

	return (0);
}