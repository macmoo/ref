/*
	strpbrk�֐��̗��p��i���̂Q�j
*/

#include  <stdio.h>
#include  <string.h>

int main(void)
{
	char  str[80];
	char  ultr[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";	/* �p�啶�� */
	char  *p;

	printf("���������͂��Ă��������F");
	scanf("%s", str);

	puts("���̕����񂩂�p�啶���𒊏o���܂��B");

	p = str;						/* ������̐擪�������w�� */

	while ((p = strpbrk(p, ultr)) != NULL)
		putchar(*p++);
	putchar('\n');

	return (0);
}