/*
	�|�C���^��const
*/

#include  <stdio.h>

int main(void)
{
	int		   nm = 1;
	const int  nc = 2;

	int		  *			p1;
	const int *			p2;
	int		  * const	p3m = &nm;
	int		  * const	p3c = &nc;
	const int * const	p4m = &nm;
	const int * const	p4c = &nc;

	nm = 100;					/* �n�j�I */
	nc = 100;					/* �G���[ */

	p1 = &nm;	*p1 = 100;		/* �n�j�I	�n�j�I */
	p1 = &nc;	*p1 = 100;		/* �n�j�I	����` */

	p2 = &nm;	*p2 = 100;		/* �n�j�I	�G���[ */
	p2 = &nc;	*p2 = 100;		/* �n�j�I	�G���[ */

	p3m = &nm;	p3c = &nc;		/* �G���[	�G���[ */

	*p3m = 100;					/* �G���[ */
	*p3c = 100;					/* �G���[ */

	p4m = &nm;	p4c = &nc;		/* �G���[	�G���[ */

	*p4m = 100;					/* �G���[ */
	*p4c = 100;					/* �G���[ */

	return (0);
}