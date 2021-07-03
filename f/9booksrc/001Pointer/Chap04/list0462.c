/*
	strtokŠÖ”‚Ì—˜—p—á
*/

#include  <stdio.h>
#include  <string.h>

int main(void)
{
	char  str[60];			/* •ª‰ğ‚·‚é•¶š—ñ */
	char  sep[] = ".,;";	/* ‚±‚Ì•¶š‚Å•ª‰ğ */
	char  *p;

	printf("•¶š—ñ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢F");
	scanf("%s", str);

	p = strtok(str, sep);
	while (p != NULL) {
		printf("%s\n", p);
		p = strtok(NULL, sep); 
	}

	return (0);
}
