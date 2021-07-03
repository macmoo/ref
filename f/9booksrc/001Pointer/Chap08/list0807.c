/*--- 先頭ノードの削除（間違い） ---*/
void DeleteNode(List *list)
{
	Node  *ptr = list->head->next;
	free(list->head);
	list->head = ptr;
}
