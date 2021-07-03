/*
	構造体のメンバに値を読み込む（その２）
*/

#include  <stdio.h>

typedef struct {		/* 会員データ */
	int	  no;			/* 会員番号 */
	char  name[10];		/* 氏　　名 */
} Member;

int main(void)
{
	Member	m1;

	printf("会員番号：");	scanf("%d", &m1.no);		/* &は必要 */
	printf("氏　　名：");	scanf("%s", m1.name);		/* &は不要 */

	printf("会員番号＝%d\n", m1.no);
	printf("氏　　名＝%s\n", m1.name);

	return (0);
}
