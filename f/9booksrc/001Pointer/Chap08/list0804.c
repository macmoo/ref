/*--- �����ւ̃m�[�h�}�� ---*/
void AppendNode(List *list, const char *name, const char *tel)
{
	Node  *ptr = list->tail;		/* �}���O�̖����m�[�h�ւ̃|�C���^ */

	list->tail = AllocNode();
	strcpy(ptr->name, name);
	strcpy(ptr->tel,  tel);
	ptr->next = list->tail;
}