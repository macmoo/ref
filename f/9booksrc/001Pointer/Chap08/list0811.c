/*
	電話連絡用線形リスト（ノードの挿入と表示）
*/

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

/*--- メニュー ---*/
typedef enum {
	Term, Insert, Append, Delete, Remove, Clear, Print
} Menu;

/*--- ノード ---*/
typedef struct __node {
	char		   name[20];	/* 名前 */
	char		   tel[16];		/* 電話番号 */
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

/*--- データの入力 ---*/
Node Read(char *message)
{
	Node  temp;

	printf("%sするデータを入力してください。\n", message);

	printf("名　　前：");	scanf("%s", temp.name);
	printf("電話番号：");	scanf("%s", temp.tel);

	return (temp);
}

/*--- メニュー選択 ---*/
Menu SelectMenu(void)
{
	int	 ch;

	do {
		puts("(1) 先頭にノードを挿入   (2) 末尾にノードを挿入");
		puts("(3) 先頭のノードを削除   (4) 末尾のノードを削除");
		puts("(5) 全てのノードを削除   (6) 全てのノードを表示");
		puts("(0) 終　　　　　　　了");
		printf("番号：");
		scanf("%d", &ch);
	} while (ch < Term	||	ch > Print);
	return ((Menu)ch);
}

/*--- メイン ---*/
int main(void)
{
	Menu  menu;
	List  list;

	InitList(&list);

	do {
		Node  x;
		switch (menu = SelectMenu()) {
		 case Insert: x = Read("先頭に挿入");
					  InsertNode(&list, x.name, x.tel);	break;
		 case Append: x = Read("末尾に挿入");
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