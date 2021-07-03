/*
	共用体のメンバに値を読み込む
*/

#include  <stdio.h>

typedef		union {
	int		x;
	double	y;
} UXY;

/*--- aの指す構造体のメンバのいずれかに値を読み込む ---*/
void getUXY(UXY *a, int sw)
{
	switch (sw) {
	 case 0 : printf("x : ");	scanf("%d",	 &a->x);	break;
	 case 1 : printf("y : ");	scanf("%lf", &a->y);	break;
	}
}

int main(void)
{
	int	 s;
	UXY	 ua;

	printf("xとyのどちらに値を入力しますか（0-x／1-y）：");
	scanf("%d",	 &s);
	
	getUXY(&ua, s);

	printf("ua.x = %d\n",	ua.x);
	printf("ua.y = %.2f\n",	ua.y);

	return (0);
}
