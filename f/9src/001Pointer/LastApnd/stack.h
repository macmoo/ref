/*
	汎用スタック（ヘッダ部）	"stack.h"
*/

#if !defined(__STACK)
#define __STACK

#include  <stdlib.h>

/*--- スタックを実現する構造体 ---*/
typedef struct {
	size_t	sz;		/* 要素の大きさ */
	int		max;	/* 最大の要素数 */
	int		ptr;	/* スタックポインタ */
	void	*stk;	/* スタック（の先頭要素へのポインタ） */
} Stack;

/*--- スタックの初期化 ---*/
Stack *StackAlloc(size_t size, int max);

/*--- スタックの後始末 ---*/
void StackFree(Stack *s);

/*--- スタックにデータをプッシュ ---*/
int StackPush(Stack *s, void *x);

/*--- スタックからデータをポップ ---*/
int StackPop(Stack *s, void *x);

/*--- スタックからデータをピーク ---*/
int StackPeek(const Stack *s, void *x);

/*--- スタックの大きさ ---*/
int StackSize(const Stack *s);

/*--- スタックに積まれているデータ数 ---*/
int StackNo(const Stack *s);

/*--- スタックは空か ---*/
int StackIsEmpty(const Stack *s);

/*--- スタックは満杯か ---*/
int StackIsFull(const Stack *s);

/*--- スタックを空にする ---*/
void StackClear(Stack *s);

#endif
