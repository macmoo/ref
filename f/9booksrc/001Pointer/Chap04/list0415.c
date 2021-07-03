/*
	•¶š—ñ‚ğ•\¦
*/

#include  <stdio.h>

/*--- •¶š—ñs‚ğ•\¦ ---*/
void put_str(const char *s)
{
	while (*s)
		putchar(*s++);
}

int main(void)
{
	char  str[100];

	printf("•¶š—ñ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢F");
	scanf("%s", str);

	put_str(str);
	putchar('\n');

	return (0);
}