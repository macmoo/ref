/*
	int型とint *型の大きさを表示
*/

#include  <stdio.h>

int main(void)
{
	int	 nx;		/* int型 */
	int	 *pt;		/* int *型 */

	printf("int  型は%uバイトです。\n",	(unsigned)sizeof(int));
	printf("int *型は%uバイトです。\n",	(unsigned)sizeof(int *));

	printf(" nxは%uバイトです。\n",	(unsigned)sizeof(nx));
	printf("*ptは%uバイトです。\n",	(unsigned)sizeof(*pt));
	printf(" ptは%uバイトです。\n",	(unsigned)sizeof(pt));
	printf("&nxは%uバイトです。\n",	(unsigned)sizeof(&nx));

	return (0);
}