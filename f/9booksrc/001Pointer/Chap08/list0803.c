/*--- æ“ª‚Ö‚Ìƒm[ƒh‘}“ü ---*/
void InsertNode(List *list, const char *name, const char *tel)
{
	Node  *ptr = list->head;			/* ‘}“ü‘O‚Ìæ“ªƒm[ƒh‚Ö‚Ìƒ|ƒCƒ“ƒ^ */

	list->head = AllocNode();
	strcpy(list->head->name, name);
	strcpy(list->head->tel,	 tel);
	list->head->next = ptr;
}
