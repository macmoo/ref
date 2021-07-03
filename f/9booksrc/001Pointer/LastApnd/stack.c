/*
	�ėp�X�^�b�N�i�������j	"stack.c"
*/

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>
#include  "stack.h"

/*--- �X�^�b�N�̏����� ---*/
Stack *StackAlloc(size_t size, int max)
{
	Stack *s;

	if ((s = calloc(1, sizeof(Stack))) == NULL)
		return (s);									/* �X�^�b�N�̊m�ۂɎ��s */
	if ((s->stk = calloc(max, size)) == NULL) {
		free(s);									/* �{�̕��̊m�ۂɎ��s */
		return (NULL);
	}
	s->sz  = size;
	s->max = max;
	s->ptr = 0;
	return (s);
}

/*--- �X�^�b�N�̌�n�� ---*/
void StackFree(Stack *s)
{
	if (s != NULL  &&  s->stk != NULL) {
		free(s->stk);
		free(s);
	}
}

/*--- �X�^�b�N�Ƀf�[�^���v�b�V�� ---*/
int StackPush(Stack *s, void *x)
{
	if (s->ptr >= s->max)
		 return (-1);
	memcpy((char *)s->stk + s->ptr * s->sz, x, s->sz);
	s->ptr++;
	return (0);
}

/*--- �X�^�b�N����f�[�^���|�b�v ---*/
int StackPop(Stack *s, void *x)
{
	if (s->ptr <= 0)							/* �X�^�b�N�͋� */
		return (-1);
	s->ptr--;
	memcpy(x, (char *)s->stk + s->ptr * s->sz, s->sz);
	return (0);
}


/*--- �X�^�b�N����f�[�^���s�[�N ---*/
int StackPeek(const Stack *s, void *x)
{
	if (s->ptr <= 0)							/* �X�^�b�N�͋� */
		return (-1);
	memcpy(x, (char *)s->stk + (s->ptr - 1) * s->sz, s->sz);
	return (0);
}

/*--- �X�^�b�N�̑傫�� ---*/
int StackSize(const Stack *s)
{
	return (s->max);
}

/*--- �X�^�b�N�ɐς܂�Ă���f�[�^�� ---*/
int StackNo(const Stack *s)
{
	return (s->ptr);
}

/*--- �X�^�b�N�͋� ---*/
int StackIsEmpty(const Stack *s)
{
	return (s->ptr <= 0);
}

/*--- �X�^�b�N�͖��t�� ---*/
int StackIsFull(const Stack *s)
{
	return (s->ptr >= s->max);
}

/*--- �X�^�b�N����ɂ��� ---*/
void StackClear(Stack *s)
{
	s->ptr = 0;
}
