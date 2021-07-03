/*
	プログラム終了時にメッセージと時刻を表示
*/

#include  <time.h>
#include  <stdio.h>
#include  <stdlib.h>

/*--- 終了メッセージ表示 ----*/
void good_bye(void)
{
	puts("プログラム正常終了！");
}

/*--- 現在の時刻を表示 ---*/
void put_time(void)
{
	time_t	   current;
	struct tm  *lctm;

	time(&current);					/* 現在の時刻を取得 */
	lctm = localtime(&current);		/* 地方時の構造体に変換 */
	printf("%02d:%02d:%02d\n", lctm->tm_hour, lctm->tm_min, lctm->tm_sec);
}

int main(void)
{
	int	 x;

	atexit(good_bye);		/* 関数good_byeを登録 */
	atexit(put_time);		/* 関数put_timeを登録 */

	printf("正常終了(0)それとも異常終了(1)：");
	scanf("%d", &x);

	if (x) abort();			/* 異常終了（登録関数は呼び出されない） */

	return (0);
}