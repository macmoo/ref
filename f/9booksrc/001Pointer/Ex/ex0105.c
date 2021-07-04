/* 演習1-5の解答例 */

#include  <stdio.h>

/*--- xとyの和を*waに差を*saに格納 ---*/
void sum_diff(int x, int y, int *wa, int *sa)
{
	*wa = x + y;						/* 和 */
	*sa = (x > y) ? x - y : y - x;		/* 差 */
}

int main(void)
{
	int	 n1 = 100, n2 = 200;
	int	 sum, diff;		/* 和と差 */ 

	sum_diff(n1, n2, &sum, &diff);

	printf("xとyの和＝%d\n", sum);				/* sumの値を表示 */
	printf("xとyの差＝%d\n", diff);				/* diffの値を表示 */

	return (0);
}
