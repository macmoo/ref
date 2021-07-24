/* 演習6-2の解答例 */

/*--- メンバxの昇順となるようにa,bを並べかえる ---*/
void sortXYZ(struct xyz *a, struct xyz *b)
{
	if (a->x > b->x) {
		struct xyz	temp = *a;
		*a = *b;
		*b = temp;
	}
}
