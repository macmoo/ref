/*
	�I�΂ꂽ�����̖�����\���i��Q�ŁF�֐��ւ̃|�C���^�̔z��j
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

typedef	 void (*Anfunc)(void);

int main(void)
{
	Animal selected;
	Anfunc	afp[] = {dog, cat, monkey};

	do {
		selected = select();
		if (selected >= Dog	 &&	 selected < Invalid)
			afp[selected]();
	} while (selected != Invalid);

	return (0);
}