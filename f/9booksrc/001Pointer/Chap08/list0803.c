/*--- �擪�ւ̃m�[�h�}�� ---*/
void InsertNode(List *list, const char *name, const char *tel)
{
	Node  *ptr = list->head;			/* �}���O�̐擪�m�[�h�ւ̃|�C���^ */

	list->head = AllocNode();
	strcpy(list->head->name, name);
	strcpy(list->head->tel,	 tel);
	list->head->next = ptr;
}
