/* 演習6-2の解答例 */

#include  <stdio.h>

struct xyz {
	int		x;
	long	y;
	double	z;
};

/*--- メンバxの昇順となるようにa,bを並べかえる ---*/
void sortXYZ(struct xyz *a, struct xyz *b)
{
	if (a->x > b->x) {
		struct xyz	temp = *a;
		*a = *b;
		*b = temp;
	}
}

/*--- aの指す構造体のメンバに値を読み込む ---*/
void getXYZ(struct xyz *a)
{
	printf("x : ");	  scanf("%d",  &a->x);
	printf("y : ");	  scanf("%ld", &a->y);
	printf("z : ");	  scanf("%lf", &a->z);
}

int main(void)
{
	struct xyz	a, b;

	puts("aの各メンバの値を代入せよ。");
	getXYZ(&a);

	puts("bの各メンバの値を代入せよ。");
	getXYZ(&b);

	puts("メンバxの昇順にソートしました。");
	sortXYZ(&a, &b);

	printf("a.x = %d\n",	a.x);	/* メンバの値を表示 */
	printf("a.y = %ld\n",	a.y);	/* 　〃　 */
	printf("a.z = %.2f\n",	a.z);	/* 　〃　 */

	printf("b.x = %d\n",	b.x);	/* メンバの値を表示 */
	printf("b.y = %ld\n",	b.y);	/* 　〃　 */
	printf("b.z = %.2f\n",	b.z);	/* 　〃　 */

	return (0);
}
