/*
	qsort�֐���p���č\���̂̔z����\�[�g
*/

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

typedef struct {
	char  name[10];		/* ���O */
	int	  height;		/* �g�� */
	int	  weight;		/* �̏d */
} Person;

/*--- Person�^�̔�r�֐��i���O�����j ---*/
int npcmp(const Person *x, const Person *y)
{
	return (strcmp(x->name, y->name));
}

/*--- Person�^�̔�r�֐��i�g�������j ---*/
int hpcmp(const Person *x, const Person *y)
{
	return (x->height < y->height ?	-1 :
			x->height > y->height ?	 1 : 0);
}

/*--- Person�^�̔�r�֐��i�̏d�~���j ---*/
int wdcmp(const Person *x, const Person *y)
{
	return (x->weight < y->weight ?	 1 :
			x->weight > y->weight ?	-1 : 0);
}

/*--- no�l���̃f�[�^��\�� ---*/
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

	int	 nx = sizeof(x) / sizeof(x[0]);		/* �z��x�̗v�f�� */

	puts("�\�[�g�O");
	print_person(x, nx);

	/* ���O�����Ƀ\�[�g */
	qsort(x, nx, sizeof(Person), (int (*)(const void *, const void *))npcmp);

	puts("\n���O�����\�[�g��");
	print_person(x, nx);

	/* �g�������Ƀ\�[�g */
	qsort(x, nx, sizeof(Person), (int (*)(const void *, const void *))hpcmp);

	puts("\n�g�������\�[�g��");
	print_person(x, nx);

	/* �̏d�~���Ƀ\�[�g */
	qsort(x, nx, sizeof(Person), (int (*)(const void *, const void *))wdcmp);

	puts("\n�̏d�~���\�[�g��");
	print_person(x, nx);

	return (0);
}
