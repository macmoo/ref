/*--- �擪�m�[�h�̍폜�i�ԈႢ�j ---*/
void DeleteNode(List *list)
{
	Node  *ptr = list->head->next;
	free(list->head);
	list->head = ptr;
}
