/*
	�|�C���^�l����������֐�
*/

#include  <stdio.h>

/*--- ��̃|�C���^������ ---*/
void swap_ptr(char **x, char **y)
{
	char  *tmp = *x;
	*x = *y;
	*y = tmp;
}
 
int main(void)
{
	char  *s1 = "ABC";
	char  *s2 = "DEF";

	printf("������s1��%s�ł��B\n", s1);
	printf("������s2��%s�ł��B\n", s2);

	swap_ptr(&s1, &s2);

	puts("�|�C���^s1��s2���������܂����B");

	printf("������s1��%s�ł��B\n", s1);
	printf("������s2��%s�ł��B\n", s2);

	return (0);
}
