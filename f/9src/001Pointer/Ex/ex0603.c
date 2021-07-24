/* 演習6-3の解答例 */

void getMember(Member *p)
{
	printf("会員番号：");	scanf("%d", &p->no);		/* &は必要 */
	printf("氏　　名：");	scanf("%s", p->name);		/* &は不要 */
}
