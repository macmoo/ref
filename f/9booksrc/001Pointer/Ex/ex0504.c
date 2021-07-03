/* ���K5-4�̉� */

#include  <stdio.h>
#include  <stdlib.h>

/*--- src����̓��͂��^�u������dst�֏o�� ---*/
void entab(FILE *src, FILE *dst, int width)
{
	int	 ch;
	int	 count = 0;
	int	 ntab  = 0;
	int	 pos   = 1;

	for ( ; (ch = fgetc(src)) != EOF; pos++)
		if (ch == ' ') {
			if (pos % width != 0)
				count++;
			else {
				count = 0;
				ntab++;
			}
		} else {
			for ( ; ntab > 0; --ntab)
				fputc('\t', dst);
			if (ch == '\t')
				count = 0;
			else
				for (; count > 0; count--)
					fputc(' ', dst);
			fputc(ch, dst);
			if (ch == '\n')
				pos = 0;
			else if (ch == '\t')
				pos += width - (pos - 1) % width - 1;
		}
}

int main(int argc, char *argv[])
{
	int	  width = 8;
	FILE  *fp;

	if (argc < 2)
		entab(stdin, stdout, width);		/* �W������ �� �W���o�� */
	else {
		while (--argc > 0) {
			if (**(++argv) == '-') {
				if (*++(*argv) == 't')
					width = atoi(++*argv);
				else {
					fputs("�p�����[�^���s���ł��B\n", stderr);
					return (1);
				}
			} else if ((fp = fopen(*argv, "r")) == NULL) {
				fprintf(stderr, "\"%s\"�̓I�[�v���ł��܂���B\n", *argv);
				return (1);
			} else {
				entab(fp, stdout, width);	/* �X�g���[��fp �� �W���o�� */
				fclose(fp);
			}
		}
	}
	return (0);
}
