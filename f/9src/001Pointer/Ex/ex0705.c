/* 演習7-5の解答例 */

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

/*--- argvの複製を作る ---*/
int dup_argv(char ***ptr, int argc, char **argv)
{
	int	 i;

	if ((*ptr = (char **)calloc(argc + 1, sizeof(char *))) == NULL)
		return (0);

	for (i = 0; i < argc + 1; i++)
		(*ptr)[i] = NULL;

	for (i = 0; i < argc; i++) {
		if (((*ptr)[i] = (char *)malloc(strlen(argv[i]) + 1)) == NULL)
			return (0);
		strcpy((*ptr)[i], argv[i]);
	}
	return (1);
}

/*--- argvが指す文字列の配列を表示 ---*/
void print_argv(int argc, char **argv)
{
	int	 i = 0;

	while (argc-- > 0)
		printf("argv[%d] = \"%s\"\n", i++, *argv++);
}

int main(int argc, char **argv)
{
	int	  i;
	char  **pt;

	if (!dup_argv(&pt, argc, argv))
		puts("記憶域の確保に失敗しました。");
	else
		print_argv(argc, pt);

	if (pt != NULL) {
		for (i = 0; i < argc + 1; i++)
			free(pt[i]);					/* 記憶域を解放 */
		free(pt);
	}
	return (0);
}
