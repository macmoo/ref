/* ���K6-2�̉𓚗� */

/*--- �����ox�̏����ƂȂ�悤��a,b����ׂ����� ---*/
void sortXYZ(struct xyz *a, struct xyz *b)
{
	if (a->x > b->x) {
		struct xyz	temp = *a;
		*a = *b;
		*b = temp;
	}
}
