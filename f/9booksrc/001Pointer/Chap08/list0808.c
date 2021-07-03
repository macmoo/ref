/*--- æ“ªƒm[ƒh‚Ìíœ ---*/
void DeleteNode(List *list)
{
	if (list->head != list->tail) {
		Node  *ptr = list->head->next;
		free(list->head);
		list->head = ptr;
	}
}
