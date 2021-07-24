/*
	電話連絡用線形リスト（武術部と陸上部）
*/

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

/*--- メニュー ---*/
typedef enum {
	Term, Insert, Append, Delete, Remove, Clear, Print, Search,
	PutNode, InsN, InsP, ClrNode
} Menu;

/*--- ノード ---*/
typedef struct __node {
	char		   name[20];	/* 名前 */
	char		   tel[16];	/* 電話番号 */
	struct __node  *next;		/* 次の会員を指すポインタ */
} Node;

/*--- 線形リスト制御ブロック ---*/
typedef struct {
	Node  *head;				/* 先頭ノードを指すポインタ */
	Node  *tail;				/* 末尾ノードを指すポインタ */
} List;

/*--- 一つのノードを確保 ---*/
Node *AllocNode(void)
{
	return ((Node *)calloc(1, sizeof(Node)));
}

/*--- 線形リスト制御ブロックの初期化 ---*/
void InitList(List *list)
{
	list->head = list->tail = AllocNode();
}
/*--- 先頭へのノード挿入 ---*/
void InsertNode(List *list, const char *name, const char *tel)
{
	Node  *ptr = list->head;			/* 挿入前の先頭ノードへのポインタ */

	list->head = AllocNode();
	strcpy(list->head->name, name);
	strcpy(list->head->tel,	 tel);
	list->head->next = ptr;
}

/*--- 末尾へのノード挿入 ---*/
void AppendNode(List *list, const char *name, const char *tel)
{
	Node  *ptr = list->tail;		/* 挿入前の末尾ノードへのポインタ */

	list->tail = AllocNode();
	strcpy(ptr->name, name);
	strcpy(ptr->tel,  tel);
	ptr->next = list->tail;
}

/*--- 全ノードを表示 ---*/
void PrintList(List *list)
{
	Node  *ptr;

	ptr = list->head;
	while (ptr != list->tail) {
		printf("%s《%s》\n", ptr->name, ptr->tel);
		ptr = ptr->next;
	}
}

/*--- 先頭ノードの削除 ---*/
void DeleteNode(List *list)
{
	if (list->head != list->tail) {
		Node  *ptr = list->head->next;
		free(list->head);
		list->head = ptr;
	}
}

/*--- 全ノードの削除 ---*/
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

/*--- 末尾ノードの削除 ---*/
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

/*--- 名前がnameであるノードを探索 ---*/
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

/*--- pが指すノードを表示 ---*/
void PrintNode(Node *p)
{
	printf("%s《%s》\n", p->name, p->tel);
}

/*--- pが指すノードの直後にノードを挿入 ---*/
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

/*--- pが指すノードの直前にノードを挿入 ---*/
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

/*--- pが指すノードを削除 ---*/
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

/*--- データの入力 ---*/
Node Read(char *message)
{
	Node  temp;

	printf("%sするデータを入力してください。\n", message);

	printf("名　　前：");	scanf("%s", temp.name);
	printf("電話番号：");	scanf("%s", temp.tel);

	return (temp);
}

/*--- 探索実行 ---*/
void DoSearch(List *list, Node **p)
{
	Node  *ptr;
	char  name[100];

	printf("探索する名前：");
	scanf("%s", name);

	if ((ptr = SearchNode(list, name)) == NULL) {
		puts("見つかりませんでした。");
		*p = list->head;
	} else {
		PrintNode(ptr);
		*p = ptr;
	}
}

/*--- 操作対象リスト選択 ---*/
int SelectList(void)
{
	int	 ch;

	do {
		printf("<1> 武術部  <2> 陸上部  (0) 終了：");
		scanf("%d", &ch);
	} while (ch < 0	 ||	 ch > 2);
	return (ch - 1);
}

/*--- メニュー選択 ---*/
Menu SelectMenu(void)
{
	int	 ch;

	do {
		puts("( 1) 先頭にノードを挿入   ( 2) 末尾にノードを挿入");
		puts("( 3) 先頭のノードを削除   ( 4) 末尾のノードを削除");
		puts("( 5) 全てのノードを削除   ( 6) 全てのノードを表示");
		puts("( 7) 名前でノードを探索   ( 8) 着目ノード を 表示");
		puts("( 9) 着目ノード後に挿入   (10) 着目ノード前に挿入");
		puts("(11) 着目ノード を 削除   ( 0) 終　　　　　　　了");
		printf("番号：");
		scanf("%d", &ch);
	} while (ch < Term	||	ch > ClrNode);
	return ((Menu)ch);
}

/*--- メイン ---*/
int main(void)
{
	Menu  menu;
	List  list[2];		/* [0]…武術部／[1]…陸上部		*/
	Node  *ptr[2];		/* 　　　　　 〃			*/
	int	  br;

	InitList(&list[0]);			/* 武術部の電話連絡簿を生成 */
	InitList(&list[1]);			/* 陸上部の電話連絡簿を生成 */

	ptr[0] = list[0].head;
	ptr[1] = list[1].head;

	while (1) {
		Node  x;

		if ((br = SelectList()) == -1)
			break;

		switch (menu = SelectMenu()) {
		 case Insert: x = Read("先頭に挿入");
					  InsertNode(&list[br], x.name, x.tel);			break;

		 case Append: x = Read("末尾に挿入");
					  AppendNode(&list[br], x.name, x.tel);			break;

		 case Delete: DeleteNode(&list[br]);						break;

		 case Remove: RemoveNode(&list[br]);						break;

		 case Clear : ClearList(&list[br]);							break;

		 case Print : PrintList(&list[br]);							break;

		 case Search: DoSearch(&list[br], &ptr[br]);				break;

		 case PutNode : PrintNode(ptr[br]);							break;

		 case InsN	: x = Read("着目ノード後に挿入");
					  PutNodeN(&list[br], ptr[br], x.name, x.tel);	break;

		 case InsP	: x = Read("着目ノード前に挿入");
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
