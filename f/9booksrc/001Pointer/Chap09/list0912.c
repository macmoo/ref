/*
	�I�΂ꂽ�����̖�����\���i��P�Łj
*/

#include  <stdio.h>

typedef enum {Dog, Cat, Monkey, Invalid} Animal;

/*--- ������ ---*/
void dog(void)
{
	puts("��������!!");
}

/*--- �L���� ---*/
void cat(void)
{
	puts("�j���`�I!!");
}

/*--- ������ ---*/
void monkey(void)
{
	puts("�L�b�L�b!!");
}

/*--- ������I�� ---*/
Animal select(void)
{
	int	 tmp;

	do {
		printf("�O�c���@�P�c�L�@�Q�c���@�R�c�I���F");
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
		 case Dog :	   dog();		break;		/* �� */
		 case Cat :	   cat();		break;		/* �L */
		 case Monkey : monkey();	break;		/* �� */
		}
	} while (selected != Invalid);

	return (0);
}