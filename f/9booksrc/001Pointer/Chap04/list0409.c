/*
	�����̔z��ɕ�������i�[���ĕ\���i���̂Q�j
*/

#include  <stdio.h>

int main(void)
{
	char  str[6];

	str[0] = 'A';
	str[1] = 'B';
	str[2] = 'C';
	str[3] = '\0';			/* �����܂ł������� */
	str[4] = 'D';
	str[5] = 'E';

	printf("�z��str�ɕ�����\"%s\"���i�[����Ă��܂��B\n", str);

	return (0);
}