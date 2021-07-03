/*
	選ばれた動物の鳴き声を表示（第１版）
*/

#include  <stdio.h>

typedef enum {Dog, Cat, Monkey, Invalid} Animal;

/*--- 犬が鳴く ---*/
void dog(void)
{
	puts("ワンワン!!");
}

/*--- 猫が鳴く ---*/
void cat(void)
{
	puts("ニャ～オ!!");
}

/*--- 猿が鳴く ---*/
void monkey(void)
{
	puts("キッキッ!!");
}

/*--- 動物を選ぶ ---*/
Animal select(void)
{
	int	 tmp;

	do {
		printf("０…犬　１…猫　２…猿　３…終了：");
		scanf("%d", &tmp);
	} while (tmp < Dog	||	tmp > Invalid);
	return (tmp);
}

int main(void)
{
	Animal	selected;

	do {
		selected = select();
		switch (selected) {
		 case Dog :	   dog();		break;		/* 犬 */
		 case Cat :	   cat();		break;		/* 猫 */
		 case Monkey : monkey();	break;		/* 猿 */
		}
	} while (selected != Invalid);

	return (0);
}