/* 演習5-1の解答例 */

#include  <time.h>
#include  <stdio.h>
#include  <stdlib.h>
#include  <limits.h>

#define	QNO	   12		/* 単語の数 */
#define	CNO		4		/* 選択肢の数 */

#define swap(type, x, y) do { type t = x; x = y; y = t; } while (0)

/*--- 日本語 ---*/
char *jptr[] = {
	"動物", "車",	"花",	"家",	"机",	"本",
	"椅子", "父",	"母",	"愛",	"平和",	"雑誌",
};

/*--- 英語 ---*/
char *eptr[] = {
	"animal", "car",	"flower", "house", "desk",	"book",
	"chair",  "father",	"mother", "love",  "peace",	"magazine",
};

/*--- 選択肢を作成し正解の添字を返す ---*/
int make_cand(int c[], int n)
{
	int	 i, j;

	c[0] = n;
	for (i = 1; i < CNO; i++) {
		int	 x;
		do {
			x = rand() % QNO;
			for (j = 0; j < i; j++)
				if (c[j] == x)
					break;
		} while (i != j);
		c[i] = x;
	}
	j = rand() % CNO;
	swap(int, c[0], c[j]);

	return (j);
}

/*--- 選択肢を表示 ---*/
void print_cand(int c[], int sw)
{
	int	 i;
	for (i = 0; i < CNO; i++)
		printf("(%d) %s  ", i, sw ? jptr[c[i]] : eptr[c[i]]);
	printf("：");
}

int main(void)
{
	int	 nq;			/* 問題の番号 */
	int	 na;			/* 正解の番号 */
	int	 sw;			/* 0：英語→日本語／1：日本語→英語 */
	int	 retry;			/* 再挑戦するか？ */
	int	 cand[CNO];		/* 選択肢の番号 */

	srand((unsigned)time(NULL) % RAND_MAX);

	do {
		int	 no;

		nq = rand() % QNO;
		na = make_cand(cand, nq);
		sw = rand() % 2;

		printf("%sはどれですか？\n", sw ? eptr[nq] : jptr[nq]);

		do {
			print_cand(cand, sw);
			scanf("%d", &no);
			if (no != na)
				puts("違います。");
		} while (no != na);
		puts("正解です。");
		printf("もう一度？ 0-いいえ／1-はい：");
		scanf("%d", &retry);
	} while (retry == 1);

	return (0);
}
