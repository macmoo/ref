/*
	��̕����񃊃e�����Ő����Ɛ���\���i���̂P�j
*/

#include  <stdio.h>

int main(void)
{
	char  *s1 = "BohYoh Shibata";
	char  *s2 = &s1[7];

	printf("�t���l�[����%s�ł��B\n", s1);
	printf("�t�@�~���[�l�[����%s�ł��B\n", s2);

	return (0);
}