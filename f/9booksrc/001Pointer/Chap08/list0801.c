/*
	電話連絡簿の表示
*/

#include  <stdio.h>

/*--- 電話連絡簿を表す構造体の配列 ---*/
struct List {
	char  name[20];		/* 名前 */
	char  tel[16];		/* 電話番号 */
	int	  next;			/* 次の会員 */
} data[6] = {
	"柴田望洋", "999-2536-1296",  3,
	"池田幸喜", "999-5351-5298",  0,
	"武田和宏", "999-1245-2538", -1,
	"立野繁之", "999-3978-4593",  2,
	"",			"",				  0,
	"",			"",				  0,
};

int	 top = 1;					/* 最初に電話をかける会員 */

int main(void)
{
	int	 now;					/* 現在着目している会員 */

	puts("--- 電話連絡簿 ---");

	now = top;
	while (now != -1) {
		printf("%s《%s》\n", data[now].name, data[now].tel);
		now = data[now].next;
	}

	return (0);
}