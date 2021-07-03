/*
	汎用スタック（実現部）	"stack.c"
*/

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>
#include  "stack.h"

/*--- スタックの初期化 ---*/
Stack *StackAlloc(size_t size, int max)
{
	Stack *s;

	if ((s = calloc(1, sizeof(Stack))) == NULL)
		return (s);									/* スタックの確保に失敗 */
	if ((s->stk = calloc(max, size)) == NULL) {
		free(s);									/* 本体部の確保に失敗 */
		return (NULL);
	}
	s->sz  = size;
	s->max = max;
	s->ptr = 0;
	return (s);
}

/*--- スタックの後始末 ---*/
void StackFree(Stack *s)
{
	if (s != NULL  &&  s->stk != NULL) {
		free(s->stk);
		free(s);
	}
}

/*--- スタックにデータをプッシュ ---*/
int StackPush(Stack *s, void *x)
{
	if (s->ptr >= s->max)
		 return (-1);
	memcpy((char *)s->stk + s->ptr * s->sz, x, s->sz);
	s->ptr++;
	return (0);
}

/*--- スタックからデータをポップ ---*/
int StackPop(Stack *s, void *x)
{
	if (s->ptr <= 0)							/* スタックは空 */
		return (-1);
	s->ptr--;
	memcpy(x, (char *)s->stk + s->ptr * s->sz, s->sz);
	return (0);
}


/*--- スタックからデータをピーク ---*/
int StackPeek(const Stack *s, void *x)
{
	if (s->ptr <= 0)							/* スタックは空 */
		return (-1);
	memcpy(x, (char *)s->stk + (s->ptr - 1) * s->sz, s->sz);
	return (0);
}

/*--- スタックの大きさ ---*/
int StackSize(const Stack *s)
{
	return (s->max);
}

/*--- スタックに積まれているデータ数 ---*/
int StackNo(const Stack *s)
{
	return (s->ptr);
}

/*--- スタックは空か ---*/
int StackIsEmpty(const Stack *s)
{
	return (s->ptr <= 0);
}

/*--- スタックは満杯か ---*/
int StackIsFull(const Stack *s)
{
	return (s->ptr >= s->max);
}

/*--- スタックを空にする ---*/
void StackClear(Stack *s)
{
	s->ptr = 0;
}
