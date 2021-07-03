/*
	電話連絡簿用線形リスト（ノードの挿入と表示）
*/

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

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

/*
	以下の関数の定義をここに埋め込んでください。
		InitList
		InsertNode
		AppendNode
		PrintList
*/

/*--- メイン関数 ---*/
int main(void)
{
	List  list;						/* 制御ブロック用変数 */

	InitList(&list);				/* 空の線形リストを作成 */

	InsertNode(&list, "柴田望洋", "999-2536-1296");		/* 先頭に挿入 */
	AppendNode(&list, "立野繁之", "999-3978-4593");		/* 末尾に挿入 */
	InsertNode(&list, "池田幸喜", "999-5351-5298");		/* 先頭に挿入 */
	AppendNode(&list, "武田和宏", "999-1245-2538");		/* 末尾に挿入 */

	puts("--- 電話連絡簿 ---");
	PrintList(&list);				/* リスト上の全ノードを表示 */

	return (0);
}
