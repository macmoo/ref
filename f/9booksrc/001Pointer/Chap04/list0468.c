/*
	memcpy�֐���memmove�֐��̗��p��
*/

#include  <stdio.h>
#include  <string.h>

/*--- �z��b�̗v�f��a�ɃR�s�[ ---*/
int arycpy(int a[], const int b[], int na)
{
	if (na <= 0)						/* na��0�łȂ���΂Ȃ�Ȃ� */
		return (1);
	else {
		memcpy(a, b, na * sizeof(int)); 
		return (0);
	}
}

/*--- a[idx]��x��}�����Ĉȍ~�̗v�f��������炷 ---*/
int aryins(int a[], int na, int idx, int x)
{
	if (idx < 0	 ||	 idx >= na)		/* 0��idx��na�łȂ���΂Ȃ�Ȃ� */
		return (1);
	else {
		memmove(&a[idx + 1], &a[idx], (na - idx - 1) * sizeof(int)); 
		a[idx] = x;
		return (0);
	}
}

#define	MAX		5		/* �z��̗v�f�� */

int main(void)
{
	int	 i;
	int	 x[MAX] = {1, 2, 3, 4, 5};
	int	 y[MAX] = {9, 9, 9, 9, 9};

	arycpy(y, x, MAX);		/* x�̑S�v�f��y�ɃR�s�[ */

	aryins(x, MAX, 2, 10);	/* x[2]��10��}�� */

	puts("        x   y ");
	puts("--------------");

	for (i = 0; i < MAX; i++)
		printf("[%d] :%4d%4d\n", i, x[i], y[i]);

	return (0);
}
