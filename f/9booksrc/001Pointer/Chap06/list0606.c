/*
	�z����\���̂ŕ��Œl�n��
*/

#include  <stdio.h>

typedef struct {
	int	 a[10];
} int10ary;

/*--- �󂯎�����\���̒��̔z��̑S�v�f��0���i�[ ---*/
void func(int10ary x)
{
	int	 i;

	for (i = 0; i < 10; i++)
		x.a[i] = 0;
}

int main(void)
{
	int	 i;
	int10ary  c;

	for (i = 0; i < 10; i++)
		c.a[i] = i;

	func(c);
	puts("�S�v�f��0�������܂����B");		/* �R�ł� */

	for (i = 0; i < 10; i++)
		printf("c.a[%d] = %d\n", i, c.a[i]);

	return (0);
}
