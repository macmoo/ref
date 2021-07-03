/* 演習5-3の解答例 */

#include  <stdio.h>
#include  <stdlib.h>

/*--- srcからの入力をタブを展開してdstへ出力 ---*/
void detab(FILE *src, FILE *dst, int width)
{
	int	 ch;
	int	 pos = 1;

	while ((ch = fgetc(src)) != EOF) {
		int	 num;
		switch (ch) {
		 case '\t':
			num = width - (pos - 1) % width;
			for ( ; num > 0; num--, pos++)
				fputc(' ', dst);
			break;
		 case '\n':
			fputc(ch, dst); pos=1; break;
		 default:
			fputc(ch, dst); pos++; break;
		}
	}
}

int main(int argc, char *argv[])
{
	int	  width = 8;
	FILE  *fp;

	if (argc < 2)
		detab(stdin, stdout, width);		/* 標準入力 → 標準出力 */
	else {
		while (--argc > 0) {
			if (**(++argv) == '-') {
				if (*++(*argv) == 't')
					width = atoi(++*argv);
				else {
					fputs("パラメータが不正です。\n", stderr);
					return (1);
				}
			} else if ((fp = fopen(*argv, "r")) == NULL) {
				fprintf(stderr, "\"%s\"はオープンできません。\n", *argv);
				return (1);
			} else {
				detab(fp, stdout, width);	/* ストリームfp → 標準出力 */
				fclose(fp);
			}
		}
	}
	return (0);
}
