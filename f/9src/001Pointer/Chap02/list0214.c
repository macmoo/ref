/*
	ポインタとconst
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

	nm = 100;					/* ＯＫ！ */
	nc = 100;					/* エラー */

	p1 = &nm;	*p1 = 100;		/* ＯＫ！	ＯＫ！ */
	p1 = &nc;	*p1 = 100;		/* ＯＫ！	未定義 */

	p2 = &nm;	*p2 = 100;		/* ＯＫ！	エラー */
	p2 = &nc;	*p2 = 100;		/* ＯＫ！	エラー */

	p3m = &nm;	p3c = &nc;		/* エラー	エラー */

	*p3m = 100;					/* エラー */
	*p3c = 100;					/* エラー */

	p4m = &nm;	p4c = &nc;		/* エラー	エラー */

	*p4m = 100;					/* エラー */
	*p4c = 100;					/* エラー */

	return (0);
}