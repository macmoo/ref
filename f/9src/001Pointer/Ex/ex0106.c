/* 演習1-6の解答例 */

#include  <stdio.h>

/*--- *xと*yの値を交換 ---*/
void swapd(double *x, double *y)
{
	double  temp = *x;
	*x = *y;
	*y = temp;
}

/*--- *pa≦*pb≦*pcとなるようにソート ---*/
void sort3d(double *pa, double *pb, double *pc)
{
	if (*pa > *pb) swapd(pa, pb);
	if (*pb > *pc) swapd(pb, pc);
	if (*pa > *pb) swapd(pa, pb);
}

int main(void)
{
	double	d1 = 3.14, d2 = 2.97, d3 = 0.01;

	sort3d(&d1, &d2, &d3);

	printf("d1の値＝%.3f\n", d1);				/* d1の値を表示 */
	printf("d2の値＝%.3f\n", d2);				/* d2の値を表示 */
	printf("d3の値＝%.3f\n", d3);				/* d3の値を表示 */

	return (0);
}
