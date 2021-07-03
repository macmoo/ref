/*
	�d�b�A���p���`���X�g�i���p���Ɨ��㕔�j
*/

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

/*--- ���j���[ ---*/
typedef enum {
	Term, Insert, Append, Delete, Remove, Clear, Print, Search,
	PutNode, InsN, InsP, ClrNode
} Menu;

/*--- �m�[�h ---*/
typedef struct __node {
	char		   name[20];	/* ���O */
	char		   tel[16];	/* �d�b�ԍ� */
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

/*--- ���O��name�ł���m�[�h��T�� ---*/
Node *SearchNode(List *list, const char *name)
{
	Node  *ptr;

	ptr = list->head;
	while (ptr != list->tail) {
		if (!strcmp(ptr->name, name))
			return (ptr);
		ptr = ptr->next;
	}
	return (NULL);
}

/*--- p���w���m�[�h��\�� ---*/
void PrintNode(Node *p)
{
	printf("%s�s%s�t\n", p->name, p->tel);
}

/*--- p���w���m�[�h�̒���Ƀm�[�h��}�� ---*/
void PutNodeN(List *list, Node *p, const char *name, const char *tel)
{
	if (p == list->tail)
		AppendNode(list, name, tel);
	else {
		Node  *temp = AllocNode();

		strcpy(temp->name, name);
		strcpy(temp->tel,  tel);
		temp->next = p->next;
		p->next = temp;
	}
}

/*--- p���w���m�[�h�̒��O�Ƀm�[�h��}�� ---*/
void PutNodeP(List *list, Node *p, const char *name, const char *tel)
{
	if (p == list->head)
		InsertNode(list, name, tel);
	else {
		Node  *temp = AllocNode();

		if (p == list->tail)
			list->tail = temp;
		else
			*temp = *p;
		strcpy(p->name, name);
		strcpy(p->tel,	tel);
		p->next = temp;
	}
}

/*--- p���w���m�[�h���폜 ---*/
void ClearNode(List *list, Node *p)
{
	if (p == list->head	 || list->head->next == list->tail)
		DeleteNode(list);
	else if (p == list->tail)
		;
	else {
		Node  *ptr = list->head;
		while (ptr->next != p)
			ptr = ptr->next;
		ptr->next = p->next;
		free(p);
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

/*--- �T�����s ---*/
void DoSearch(List *list, Node **p)
{
	Node  *ptr;
	char  name[100];

	printf("�T�����閼�O�F");
	scanf("%s", name);

	if ((ptr = SearchNode(list, name)) == NULL) {
		puts("������܂���ł����B");
		*p = list->head;
	} else {
		PrintNode(ptr);
		*p = ptr;
	}
}

/*--- ����Ώۃ��X�g�I�� ---*/
int SelectList(void)
{
	int	 ch;

	do {
		printf("<1> ���p��  <2> ���㕔  (0) �I���F");
		scanf("%d", &ch);
	} while (ch < 0	 ||	 ch > 2);
	return (ch - 1);
}

/*--- ���j���[�I�� ---*/
Menu SelectMenu(void)
{
	int	 ch;

	do {
		puts("( 1) �擪�Ƀm�[�h��}��   ( 2) �����Ƀm�[�h��}��");
		puts("( 3) �擪�̃m�[�h���폜   ( 4) �����̃m�[�h���폜");
		puts("( 5) �S�Ẵm�[�h���폜   ( 6) �S�Ẵm�[�h��\��");
		puts("( 7) ���O�Ńm�[�h��T��   ( 8) ���ڃm�[�h �� �\��");
		puts("( 9) ���ڃm�[�h��ɑ}��   (10) ���ڃm�[�h�O�ɑ}��");
		puts("(11) ���ڃm�[�h �� �폜   ( 0) �I�@�@�@�@�@�@�@��");
		printf("�ԍ��F");
		scanf("%d", &ch);
	} while (ch < Term	||	ch > ClrNode);
	return ((Menu)ch);
}

/*--- ���C�� ---*/
int main(void)
{
	Menu  menu;
	List  list[2];		/* [0]�c���p���^[1]�c���㕔		*/
	Node  *ptr[2];		/* �@�@�@�@�@ �V			*/
	int	  br;

	InitList(&list[0]);			/* ���p���̓d�b�A����𐶐� */
	InitList(&list[1]);			/* ���㕔�̓d�b�A����𐶐� */

	ptr[0] = list[0].head;
	ptr[1] = list[1].head;

	while (1) {
		Node  x;

		if ((br = SelectList()) == -1)
			break;

		switch (menu = SelectMenu()) {
		 case Insert: x = Read("�擪�ɑ}��");
					  InsertNode(&list[br], x.name, x.tel);			break;

		 case Append: x = Read("�����ɑ}��");
					  AppendNode(&list[br], x.name, x.tel);			break;

		 case Delete: DeleteNode(&list[br]);						break;

		 case Remove: RemoveNode(&list[br]);						break;

		 case Clear : ClearList(&list[br]);							break;

		 case Print : PrintList(&list[br]);							break;

		 case Search: DoSearch(&list[br], &ptr[br]);				break;

		 case PutNode : PrintNode(ptr[br]);							break;

		 case InsN	: x = Read("���ڃm�[�h��ɑ}��");
					  PutNodeN(&list[br], ptr[br], x.name, x.tel);	break;

		 case InsP	: x = Read("���ڃm�[�h�O�ɑ}��");
					  PutNodeP(&list[br], ptr[br], x.name, x.tel);	break;

		 case ClrNode: ClearNode(&list[br], ptr[br]);				break;

		}

		if (menu == Term)
			break;

		if (menu >= Insert	&&	menu < Print  ||  menu == ClrNode)
			ptr[br] = list[br].head;

	}

	ClearList(&list[0]);
	ClearList(&list[1]);

	return (0);
}
