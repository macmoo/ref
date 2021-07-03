/* 演習6-3の解答例 */

#include  <stdio.h>

typedef struct {		/* 会員データ */
	int	  no;			/* 会員番号 */
	char  name[10];		/* 氏　　名 */
} Member;

void getMember(Member *p)
{
	printf("会員番号：");	scanf("%d", &p->no);		/* &は必要 */
	printf("氏　　名：");	scanf("%s", p->name);		/* &は不要 */
}

int main(void)
{
	Member	m1;

	getMember(&m1);

	printf("会員番号＝%d\n", m1.no);
	printf("氏　　名＝%s\n", m1.name);

	return (0);
}
