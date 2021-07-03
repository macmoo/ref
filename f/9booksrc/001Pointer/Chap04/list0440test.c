/*
	strcpy�֐���strncpy�֐��̗��p��
*/

#include  <stdio.h>
#include  <string.h>

/*--- strcpy�̎����� ---*/
char *strcpy(char *s1, const char *s2)
{
	char  *p = s1;
	while (*s1++ = *s2++)
		;
	return (p);
}

/*--- strncpy�̎����� ---*/
char *strncpy(char *s1, const char *s2, size_t n)
{
	char  *p = s1;
	while (n) {
		n--;
		if (!(*s1++ = *s2++)) break;	/* '\0'����������I�� */
	}
	while (n--)
		*s1++ = '\0';					/* �c���'\0'�Ŗ��߂� */
	return (p);
}

int main(void)
{
	char  s1[10], s2[10], s3[10];
	char *x = "XXXXXXXXX";	/* 9��'X'�ƃi������ */

	strcpy(s1, "ABC");
	printf("s1 = %s\n", s1);

	printf("s1 = %s\n", strcpy(s1, "1234"));

	strcpy(s2, strcpy(s1, "HAL"));
	printf("s1 = %s\n", s1);
	printf("s2 = %s\n", s1);

	strcpy(s3, x);	strncpy(s3, "12345", 3);		printf("s3 = %s\n", s3);

	strcpy(s3, x);	strncpy(s3, "12345", 5);		printf("s3 = %s\n", s3);

	strcpy(s3, x);	strncpy(s3, "12345", 7);		printf("s3 = %s\n", s3);

	strcpy(s3, x);	strncpy(s3, "1234567890", 9);	printf("s3 = %s\n", s3);

	return (0);
}
