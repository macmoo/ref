/*
	strspn�֐���strcspn�֐��̗��p��
*/

#include  <stdio.h>
#include  <string.h>

int main(void)
{
	char  str[60];		/* ���̕����񂩂�T�� */
	char  ltr[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	unsigned  n1, n2;

	printf("���������͂��Ă��������F");
	scanf("%s", str);

	n1 = strspn( str, ltr);		/* �擪�@�p�����̕����� */
	n2 = strcspn(str, ltr);		/* �擪��p�����̕����� */

	if (n1 == 0)
		printf("�擪�͉p���ł͂���܂���B\n");
	else
		printf("�擪%u�������p������\������Ă��܂��B\n", n1);

	if (n2 == 0)
		printf("�擪�͉p���ł��B\n");
	else
		printf("�擪%u�����ɂ͉p���͊܂܂�Ă��܂���B\n", n2);

	return (0);
}
