#include  <string.h>
#include  <stdlib.h>

/*--- ������s�̕��������F<string.h>,<stdlib.h>�̃C���N���[�h���K�v ---*/
char *strdup(const char *s)
{
	char  *p = (char *)malloc(strlen(s) + 1);
	return (strcpy(p, s));
}
