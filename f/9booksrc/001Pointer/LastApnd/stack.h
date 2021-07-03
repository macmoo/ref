/*
	�ėp�X�^�b�N�i�w�b�_���j	"stack.h"
*/

#if !defined(__STACK)
#define __STACK

#include  <stdlib.h>

/*--- �X�^�b�N����������\���� ---*/
typedef struct {
	size_t	sz;		/* �v�f�̑傫�� */
	int		max;	/* �ő�̗v�f�� */
	int		ptr;	/* �X�^�b�N�|�C���^ */
	void	*stk;	/* �X�^�b�N�i�̐擪�v�f�ւ̃|�C���^�j */
} Stack;

/*--- �X�^�b�N�̏����� ---*/
Stack *StackAlloc(size_t size, int max);

/*--- �X�^�b�N�̌�n�� ---*/
void StackFree(Stack *s);

/*--- �X�^�b�N�Ƀf�[�^���v�b�V�� ---*/
int StackPush(Stack *s, void *x);

/*--- �X�^�b�N����f�[�^���|�b�v ---*/
int StackPop(Stack *s, void *x);

/*--- �X�^�b�N����f�[�^���s�[�N ---*/
int StackPeek(const Stack *s, void *x);

/*--- �X�^�b�N�̑傫�� ---*/
int StackSize(const Stack *s);

/*--- �X�^�b�N�ɐς܂�Ă���f�[�^�� ---*/
int StackNo(const Stack *s);

/*--- �X�^�b�N�͋� ---*/
int StackIsEmpty(const Stack *s);

/*--- �X�^�b�N�͖��t�� ---*/
int StackIsFull(const Stack *s);

/*--- �X�^�b�N����ɂ��� ---*/
void StackClear(Stack *s);

#endif
