/*--- �S�m�[�h��\�� ---*/
void PrintList(List *list)
{
	Node  *ptr;

	ptr = list->head;
	while (ptr != list->tail) {
		printf("%s�s%s�t\n", ptr->name, ptr->tel);
		ptr = ptr->next;
	}
}
