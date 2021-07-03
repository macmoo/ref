/* ���K9-2�̉𓚗� */

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

/*--- ������̔z��in1�~n2�̂Q�����z��j�������Ƀ\�[�g ---*/
void sort_2dstr(char *p, int n1, int n2)
{
	qsort(p, n1, n2, (int(*)(const void *, const void *))strcmp);
}

/*--- x�����y���w��������̔�r�֐��ix < y�j ---*/
int pstrcmp(const void *x, const void *y)
{
	return (strcmp(*(const char **)x, *(const char **)y));
}

/*--- ��������w���|�C���^�̔z��p�������Ƀ\�[�g ---*/
void sort_pvstr(char *p[], int n)
{
	qsort(p, n, sizeof(char *), pstrcmp);
}

int main(void)
{
	int	  i;
	char  s[][7] = {"LISP", "C", "Ada", "Pascal"};
	char  *p[]   = {"LISP", "C", "Ada", "Pascal"};
	
	sort_2dstr(&s[0][0], 4, 7);

	sort_pvstr(p, 4);

	puts("�����Ƀ\�[�g���܂����B");

	for (i = 0; i < 4; i++)
		printf("s[%d] = %s\n", i, s[i]);

	for (i = 0; i < 4; i++)
		printf("p[%d] = %s\n", i, p[i]);

	return (0);
}
