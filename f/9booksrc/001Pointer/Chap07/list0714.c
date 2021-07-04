#include  <string.h>
#include  <stdlib.h>

/*--- 文字列sの複製を作る：<string.h>,<stdlib.h>のインクルードが必要 ---*/
char *strdup(const char *s)
{
	char  *p = (char *)malloc(strlen(s) + 1);
	return (strcpy(p, s));
}
