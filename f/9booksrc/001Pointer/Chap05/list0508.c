/*
	曜日を表す英単語の学習（ポインタの配列版）
*/

#include  <stdio.h>

/*--- 曜日に対応する文字列を返す（ポインタの配列版） ---*/
char *weekstr(int wd)
{
	char *wptr[] = {
		"sunday", "monday", "tuesday", "wednesday",
		"thursday", "friday", "saturday"
	};
	return ((wd >= 0 && wd < 7) ? wptr[wd] : NULL);
}

int main(void)
{
	int	 n;
	int	 retry;

	puts("曜日を表す英単語を学習しましょう。");

	do {
		printf("0-日曜日／1-月曜日／…／6-土曜日：");
		scanf("%d", &n);

		printf("英語では%sです。\n", weekstr(n));

		printf("もう一度？ 0-いいえ／1-はい：");
		scanf("%d", &retry);
	} while (retry == 1);

	return (0);
}