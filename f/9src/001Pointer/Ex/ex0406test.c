/* 演習4-6の解答例 */

void swap_str(char s1[], char s2[])
{
	while (*s1  ||  *s2) {
		char  t = *s1;
		*s1++ = *s2;
		*s2++ = t;
	}
	*s1 = *s2 = '\0';
}

#include  <stdio.h>

int main(void)
{
	char s1[20] = "ABCDEF";
	char s2[20] = "XYZ";

	swap_str(s1, s2);

	printf("s1 = %s\n", s1);
	printf("s2 = %s\n", s2);

	return (0);
}
