/*--- ––”öƒm[ƒh‚Ìíœ ---*/
void RemoveNode(List *list)
{
	if (list->head != list->tail) {
		if (list->head->next == list->tail)
			DeleteNode(list);
		else {
			Node  *curr, *prev;

			curr = list->head;
			while (curr->next != list->tail) {
				prev = curr;
				curr = curr->next;
			}
			prev->next = list->tail;
			free(curr);
		}
	}
}
