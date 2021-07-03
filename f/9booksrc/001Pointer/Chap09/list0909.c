/*
	qsort関数を用いて構造体の配列をソート
*/

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

typedef struct {
	char  name[10];		/* 名前 */
	int	  height;		/* 身長 */
	int	  weight;		/* 体重 */
} Person;

/*--- Person型の比較関数（名前昇順） ---*/
int npcmp(const Person *x, const Person *y)
{
	return (strcmp(x->name, y->name));
}

/*--- Person型の比較関数（身長昇順） ---*/
int hpcmp(const Person *x, const Person *y)
{
	return (x->height < y->height ?	-1 :
			x->height > y->height ?	 1 : 0);
}

/*--- Person型の比較関数（体重降順） ---*/
int wdcmp(const Person *x, const Person *y)
{
	return (x->weight < y->weight ?	 1 :
			x->weight > y->weight ?	-1 : 0);
}

/*--- no人分のデータを表示 ---*/
void print_person(Person x[], int no)
{
	int	 i;

	for (i = 0; i < no; i++)
		printf("%-10.10s %dcm %dkg\n", x[i].name, x[i].height, x[i].weight);
}

int main(void)
{
	Person x[]= {{"Shibata",  170, 52},
				 {"Takaoka",  180, 70},
				 {"Nangoh",	  172, 63},
				 {"Sugiyama", 165, 50},
				};

	int	 nx = sizeof(x) / sizeof(x[0]);		/* 配列xの要素数 */

	puts("ソート前");
	print_person(x, nx);

	/* 名前昇順にソート */
	qsort(x, nx, sizeof(Person), (int (*)(const void *, const void *))npcmp);

	puts("\n名前昇順ソート後");
	print_person(x, nx);

	/* 身長昇順にソート */
	qsort(x, nx, sizeof(Person), (int (*)(const void *, const void *))hpcmp);

	puts("\n身長昇順ソート後");
	print_person(x, nx);

	/* 体重降順にソート */
	qsort(x, nx, sizeof(Person), (int (*)(const void *, const void *))wdcmp);

	puts("\n体重降順ソート後");
	print_person(x, nx);

	return (0);
}
