/* ���K7-5�̉𓚗� */

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

/*--- argv�̕�������� ---*/
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

/*--- argv���w��������̔z���\�� ---*/
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
		puts("�L����̊m�ۂɎ��s���܂����B");
	else
		print_argv(argc, pt);

	if (pt != NULL) {
		for (i = 0; i < argc + 1; i++)
			free(pt[i]);					/* �L�������� */
		free(pt);
	}
	return (0);
}
