/*
	�d�b�A����p���`���X�g�i�m�[�h�̑}���ƕ\���j
*/

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

/*--- �m�[�h ---*/
typedef struct __node {
	char		   name[20];	/* ���O */
	char		   tel[16];		/* �d�b�ԍ� */
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

/*
	�ȉ��̊֐��̒�`�������ɖ��ߍ���ł��������B
		InitList
		InsertNode
		AppendNode
		PrintList
*/

/*--- ���C���֐� ---*/
int main(void)
{
	List  list;						/* ����u���b�N�p�ϐ� */

	InitList(&list);				/* ��̐��`���X�g���쐬 */

	InsertNode(&list, "�ēc�]�m", "999-2536-1296");		/* �擪�ɑ}�� */
	AppendNode(&list, "����ɔV", "999-3978-4593");		/* �����ɑ}�� */
	InsertNode(&list, "�r�c�K��", "999-5351-5298");		/* �擪�ɑ}�� */
	AppendNode(&list, "���c�a�G", "999-1245-2538");		/* �����ɑ}�� */

	puts("--- �d�b�A���� ---");
	PrintList(&list);				/* ���X�g��̑S�m�[�h��\�� */

	return (0);
}
