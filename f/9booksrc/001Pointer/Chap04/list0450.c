/*--- strrchr�̎�����F<stddef.h>�̃C���N���[�h���K�v ---*/
char *strrchr(const char *s, int c)
{
	const char	*p = NULL;			/* �o���ʒu */

	c = (char)c;
	while (1) {
		if (*s == c)				/* ������ */
			p = s;
		if (*s == '\0')				/* �����I�� */
			break;
		s++;
	}
	return ((char *)p);
}
