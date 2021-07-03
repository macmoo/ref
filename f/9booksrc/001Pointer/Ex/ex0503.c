/* ���K5-3�̉𓚗� */

#include  <stdio.h>
#include  <stdlib.h>

/*--- src����̓��͂��^�u��W�J����dst�֏o�� ---*/
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
		detab(stdin, stdout, width);		/* �W������ �� �W���o�� */
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
				detab(fp, stdout, width);	/* �X�g���[��fp �� �W���o�� */
				fclose(fp);
			}
		}
	}
	return (0);
}
