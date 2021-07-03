/*
	汎用スタックの利用例
*/

#include  <stdio.h>
#include  "stack.h"

int main(void)
{
	Stack  *s;		/* スタック */

	/* 最大100個プッシュできるdouble型スタック */
	if ((s = StackAlloc(sizeof(double), 100)) == NULL) {
		puts("スタックの作成に失敗しました。");
		return (1);
	}

	while (1) {
		int		m;
		double	x;

		printf("現在のデータ数：%d/%d\n", StackNo(s), StackSize(s));
		printf("(1) プッシュ　(2) ポップ　(3) ピーク　(4) 空にする　(0) 終了：");
		scanf("%d", &m);

		if (m == 0) break;

		switch (m) {
		 case 1: printf("データ：");
				 scanf("%lf", &x);
				 if (StackPush(s, &x) == -1)
					puts("スタックへのプッシュに失敗しました。");	break;

		 case 2: if (StackPop(s, &x) == -1)
					puts("ポップできません。");
				 else
					printf("ポップしたデータは%fです。\n", x);		break;

		 case 3: if (StackPeek(s, &x) == -1)
					puts("ピークできません。");
				 else
					printf("ピークしたデータは%fです。\n", x);		break;

		 case 4: StackClear(s);										break;

		}
	}

	StackFree(s);

	return (0);
}
