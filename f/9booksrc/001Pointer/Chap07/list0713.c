/*
	������𓮓I�ɐ���
*/

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

int main(void)
{
	char  st[128];
	char  *pt;

	printf("������st����͂��Ă��������F");
	scanf("%s", st);

	pt = (char *)malloc(strlen(st) + 1);	/* ������𓮓I�ɐ��� */

	if (pt) {
		strcpy(pt, st);
		printf("���̕�����̃N���[��pt�����܂����B\n");
		printf("st = %s\n", st);
		printf("pt = %s\n", pt);
		free(pt);					/* �L�������� */
	}

	return (0);
}