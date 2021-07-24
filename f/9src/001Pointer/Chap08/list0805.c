/*--- 全ノードを表示 ---*/
void PrintList(List *list)
{
	Node  *ptr;

	ptr = list->head;
	while (ptr != list->tail) {
		printf("%s《%s》\n", ptr->name, ptr->tel);
		ptr = ptr->next;
	}
}
