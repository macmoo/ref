/*
	�d�b�A���p���`���X�g�i�m�[�h�̑}���ƕ\���j
*/

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

/*--- ���j���[ ---*/
typedef enum {
	Term, Insert, Append, Delete, Remove, Clear, Print
} Menu;

/*--- �m�[�h ---*/
typedef struct __node {
	char		   name[20];	/* ���O */
	char		   tel[16];		/* �d�b�ԍ� */
	struct __node  *next;		/* ���̉�����w���|�C���^ */
} Node;

/*--- ���`���X�g����u���b�N ---*/
typedef struct {
	Node  *head;				/* �擪�m�[�h���w���|�C���^ */
	Node  *tail;				/* �����m�[�h���w���|�C���^ */
} List;

/*--- ��̃m�[�h���m�� ---*/
Node *AllocNode(void)
{
	return ((Node *)calloc(1, sizeof(Node)));
}

/*--- ���`���X�g����u���b�N�̏����� ---*/
void InitList(List *list)
{
	list->head = list->tail = AllocNode();
}
/*--- �擪�ւ̃m�[�h�}�� ---*/
void InsertNode(List *list, const char *name, const char *tel)
{
	Node  *ptr = list->head;			/* �}���O�̐擪�m�[�h�ւ̃|�C���^ */

	list->head = AllocNode();
	strcpy(list->head->name, name);
	strcpy(list->head->tel,	 tel);
	list->head->next = ptr;
}

/*--- �����ւ̃m�[�h�}�� ---*/
void AppendNode(List *list, const char *name, const char *tel)
{
	Node  *ptr = list->tail;		/* �}���O�̖����m�[�h�ւ̃|�C���^ */

	list->tail = AllocNode();
	strcpy(ptr->name, name);
	strcpy(ptr->tel,  tel);
	ptr->next = list->tail;
}

/*--- �S�m�[�h��\�� ---*/
void PrintList(List *list)
{
	Node  *ptr;

	ptr = list->head;
	while (ptr != list->tail) {
		printf("%s�s%s�t\n", ptr->name, ptr->tel);
		ptr = ptr->next;
	}
}

/*--- �擪�m�[�h�̍폜 ---*/
void DeleteNode(List *list)
{
	if (list->head != list->tail) {
		Node  *ptr = list->head->next;
		free(list->head);
		list->head = ptr;
	}
}

/*--- �S�m�[�h�̍폜 ---*/
void ClearList(List *list)
{
	Node  *ptr = list->head;
	while (ptr != list->tail) {
		Node  *ptr2 = ptr->next;
		free(ptr);
		ptr = ptr2;
	}
	list->head = list->tail;
}

/*--- �����m�[�h�̍폜 ---*/
void RemoveNode(List *list)
{
	if (list->head != list->tail) {
		if (list->head->next == list->tail)
			DeleteNode(list);
		else {
			Node  *curr, *prev;

			curr = list->head;
			while (curr->next != list->tail) {
				prev = curr;
				curr = curr->next;
			}
			prev->next = list->tail;
			free(curr);
		}
	}
}

/*--- �f�[�^�̓��� ---*/
Node Read(char *message)
{
	Node  temp;

	printf("%s����f�[�^����͂��Ă��������B\n", message);

	printf("���@�@�O�F");	scanf("%s", temp.name);
	printf("�d�b�ԍ��F");	scanf("%s", temp.tel);

	return (temp);
}

/*--- ���j���[�I�� ---*/
Menu SelectMenu(void)
{
	int	 ch;

	do {
		puts("(1) �擪�Ƀm�[�h��}��   (2) �����Ƀm�[�h��}��");
		puts("(3) �擪�̃m�[�h���폜   (4) �����̃m�[�h���폜");
		puts("(5) �S�Ẵm�[�h���폜   (6) �S�Ẵm�[�h��\��");
		puts("(0) �I�@�@�@�@�@�@�@��");
		printf("�ԍ��F");
		scanf("%d", &ch);
	} while (ch < Term	||	ch > Print);
	return ((Menu)ch);
}

/*--- ���C�� ---*/
int main(void)
{
	Menu  menu;
	List  list;

	InitList(&list);

	do {
		Node  x;
		switch (menu = SelectMenu()) {
		 case Insert: x = Read("�擪�ɑ}��");
					  InsertNode(&list, x.name, x.tel);	break;
		 case Append: x = Read("�����ɑ}��");
					  AppendNode(&list, x.name, x.tel);	break;
		 case Delete: DeleteNode(&list);				break;
		 case Remove: RemoveNode(&list);				break;
		 case Clear : ClearList(&list);					break;
		 case Print : PrintList(&list);					break;
		}
	} while (menu != Term);

	ClearList(&list);

	return (0);
}