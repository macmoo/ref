/*--- 全ノードの削除 ---*/
void ClearList(List *list)
{
	Node  *ptr = list->head;
	while (ptr != list->tail) {
		Node  *ptr2 = ptr->next;
		free(ptr);
		ptr = ptr2;
	}
	list->head = list->tail;
}
