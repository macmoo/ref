/*
	�֐��ďo���ƃX�^�b�N
*/

#include  <stdio.h>
#include  <stdio.h>

void fa(void)
{
	puts("�����֐�fa�J�n");
	puts("�����֐�fa�I��");
}

void fb(void)
{
	puts("�����֐�fb�J�n");
	puts("�����֐�fb�I��");
}

void fc(void)
{
	puts("���֐�fc�J�n");
	fa();
	fb();
	puts("���֐�fc�I��");
}

int main(void)
{
	puts("main�֐��J�n");
	fc();
	puts("main�֐��I��");

	return (0);
}