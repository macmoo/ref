/*
	電話連絡簿用線形リスト（構造体とオブジェクトの生成）
*/

#include  <stdlib.h>

/*--- ノード ---*/
typedef struct __node {
	char		   name[20];	/* 名前 */
	char		   tel[16];		/* 電話番号 */
	struct __node  *next;		/* 次の人を指すポインタ */
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