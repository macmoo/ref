/*
	�����Ԃ���������񃊃e���������L����邩�ǂ������m�F
*/

#include  <stdio.h>

int main(void)
{
	char  *ptr1 = "ABC";
	char  *ptr2 = "ABC";

	if (ptr1 == ptr2)
		puts("�����Ԃ�̕����񃊃e�����͋��L����Ă��܂��B");
	else 
		puts("�����Ԃ�̕����񃊃e�����͋��L����Ă��܂���B");

	return (0);
}