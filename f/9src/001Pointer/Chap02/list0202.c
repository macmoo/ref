/*
	配列名が先頭要素へのポインタと解釈されることを確認
*/

#include  <stdio.h>

int main(void)
{
	int	 a[5];			/* aはint型の配列 */

	printf(" a   の値＝%p\n",  a   );		/* aの値を表示 */
	printf("&a[0]の値＝%p\n", &a[0]);		/* &a[0]の値を表示 */

	return (0);
}