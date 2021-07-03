/*
	�d�b�A����p���`���X�g�i�\���̂ƃI�u�W�F�N�g�̐����j
*/

#include  <stdlib.h>

/*--- �m�[�h ---*/
typedef struct __node {
	char		   name[20];	/* ���O */
	char		   tel[16];		/* �d�b�ԍ� */
	struct __node  *next;		/* ���̐l���w���|�C���^ */
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