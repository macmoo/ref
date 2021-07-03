/*
	“¯‚¶’Ô‚è‚ğ‚à‚Â•¶š—ñƒŠƒeƒ‰ƒ‹‚Ö‘‚İ
*/

#include  <stdio.h>

int main(void)
{
	char  *ptr1 = "ABC";
	char  *ptr2 = "ABC";

	ptr2[1] = 'Z';

	printf("•¶š—ñptr1‚Í\"%s\"‚Å‚·B\n", ptr1);
	printf("•¶š—ñptr2‚Í\"%s\"‚Å‚·B\n", ptr2);

	return (0);
}