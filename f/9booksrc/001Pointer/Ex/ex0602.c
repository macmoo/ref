/* ‰‰K6-2‚Ì‰ð“š—á */

/*--- ƒƒ“ƒox‚Ì¸‡‚Æ‚È‚é‚æ‚¤‚Éa,b‚ð•À‚×‚©‚¦‚é ---*/
void sortXYZ(struct xyz *a, struct xyz *b)
{
	if (a->x > b->x) {
		struct xyz	temp = *a;
		*a = *b;
		*b = temp;
	}
}
