/*
	�����񂩂�̕����̒T��
*/

#include  <stdio.h>

/*--- ������s���當��c��T�� ---*/
char *str_chr(const char *s, int c)
{
	c = (char)c;
	while (*s != c) {
		if (*s == '\0')				/* ������Ȃ����� */
			return (NULL);
		s++;
	}
	return ((char *)s);
}

int main(void)
{
	char  *ptr;
	char  ch[2];	
	char  letter[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	printf("�p�啶������͂��Ă��������F");
	scanf("%s", ch);

	if ((ptr = str_chr(letter, ch[0])) == NULL)
		printf("%c�͉p�啶���ł͂���܂���B\n", ch[0]);
	else
		printf("%c�����̃A���t�@�x�b�g��%s�ł��B\n", ch[0], ptr);

	return (0);
}