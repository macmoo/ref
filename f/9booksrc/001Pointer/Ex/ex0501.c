/* ���K5-1�̉𓚗� */

#include  <time.h>
#include  <stdio.h>
#include  <stdlib.h>
#include  <limits.h>

#define	QNO	   12		/* �P��̐� */
#define	CNO		4		/* �I�����̐� */

#define swap(type, x, y) do { type t = x; x = y; y = t; } while (0)

/*--- ���{�� ---*/
char *jptr[] = {
	"����", "��",	"��",	"��",	"��",	"�{",
	"�֎q", "��",	"��",	"��",	"���a",	"�G��",
};

/*--- �p�� ---*/
char *eptr[] = {
	"animal", "car",	"flower", "house", "desk",	"book",
	"chair",  "father",	"mother", "love",  "peace",	"magazine",
};

/*--- �I�������쐬�������̓Y����Ԃ� ---*/
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

/*--- �I������\�� ---*/
void print_cand(int c[], int sw)
{
	int	 i;
	for (i = 0; i < CNO; i++)
		printf("(%d) %s  ", i, sw ? jptr[c[i]] : eptr[c[i]]);
	printf("�F");
}

int main(void)
{
	int	 nq;			/* ���̔ԍ� */
	int	 na;			/* �����̔ԍ� */
	int	 sw;			/* 0�F�p�ꁨ���{��^1�F���{�ꁨ�p�� */
	int	 retry;			/* �Ē��킷�邩�H */
	int	 cand[CNO];		/* �I�����̔ԍ� */

	srand((unsigned)time(NULL) % RAND_MAX);

	do {
		int	 no;

		nq = rand() % QNO;
		na = make_cand(cand, nq);
		sw = rand() % 2;

		printf("%s�͂ǂ�ł����H\n", sw ? eptr[nq] : jptr[nq]);

		do {
			print_cand(cand, sw);
			scanf("%d", &no);
			if (no != na)
				puts("�Ⴂ�܂��B");
		} while (no != na);
		puts("�����ł��B");
		printf("������x�H 0-�������^1-�͂��F");
		scanf("%d", &retry);
	} while (retry == 1);

	return (0);
}
