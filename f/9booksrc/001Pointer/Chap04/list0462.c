/*
	strtok�֐��̗��p��
*/

#include  <stdio.h>
#include  <string.h>

int main(void)
{
	char  str[60];			/* �������镶���� */
	char  sep[] = ".,;";	/* ���̕����ŕ��� */
	char  *p;

	printf("���������͂��Ă��������F");
	scanf("%s", str);

	p = strtok(str, sep);
	while (p != NULL) {
		printf("%s\n", p);
		p = strtok(NULL, sep); 
	}

	return (0);
}
