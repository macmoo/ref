/*
	������̔�r�i�ԈႢ�j
*/

#include  <stdio.h>

int main(void)
{
	char  str[10];

	printf("���������͂��Ă��������F");
	scanf("%s", str);

	if (str == "ABC")
		puts("���Ȃ���\"ABC\"�Ɠ��͂��܂����ˁB");
	else
		puts("���Ȃ���\"ABC\"�Ɠ��͂��܂���ł����ˁB");

	return (0);
}