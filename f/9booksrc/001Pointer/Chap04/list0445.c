/*
	strcatŠÖ”‚ÆstrncatŠÖ”‚Ì—˜—p—á
*/

#include  <stdio.h>
#include  <string.h>

int main(void)
{
	char  s[10];
	char  *x = "ABC";

	strcpy(s, "QWE");
	strcat(s, "RTY");
	printf("s = %s\n", s);

	strcpy(s, x);	strncat(s, "123", 1);		printf("s = %s\n", s);

	strcpy(s, x);	strncat(s, "123", 3);		printf("s = %s\n", s);

	strcpy(s, x);	strncat(s, "123", 5);		printf("s = %s\n", s);

	strcpy(s, x);	strncat(s, "123456789", 5);	printf("s = %s\n", s);

	return (0);
}