/*
	プログラム名・プログラム仮引数の表示（第３版：文字単位で走査）
*/

#include  <stdio.h>

int main(int argc, char **argv)
{
	int	  i = 0;
	char  c;

	while (argc-- > 0) {
		printf("argv[%d] = \"", i++);
		while (c = *(*argv)++)
			putchar(c);
		argv++;
		printf("\"\n");
	}
	return (0);
}