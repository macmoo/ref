/*
	•¶š‚Ì”z—ñ‚É•¶š—ñ‚ğŠi”[‚µ‚Ä•\¦i‚»‚Ì‚Qj
*/

#include  <stdio.h>

int main(void)
{
	char  str[6];

	str[0] = 'A';
	str[1] = 'B';
	str[2] = 'C';
	str[3] = '\0';			/* ‚±‚±‚Ü‚Å‚ª•¶š—ñ */
	str[4] = 'D';
	str[5] = 'E';

	printf("”z—ñstr‚É•¶š—ñ\"%s\"‚ªŠi”[‚³‚ê‚Ä‚¢‚Ü‚·B\n", str);

	return (0);
}