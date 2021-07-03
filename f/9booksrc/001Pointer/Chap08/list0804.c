/*--- ––”ö‚Ö‚Ìƒm[ƒh‘}“ü ---*/
void AppendNode(List *list, const char *name, const char *tel)
{
	Node  *ptr = list->tail;		/* ‘}“ü‘O‚Ì––”öƒm[ƒh‚Ö‚Ìƒ|ƒCƒ“ƒ^ */

	list->tail = AllocNode();
	strcpy(ptr->name, name);
	strcpy(ptr->tel,  tel);
	ptr->next = list->tail;
}