/*
	文字列リテラルの大きさを表示
*/

#include  <stdio.h>

int main(void)
{
	printf("sizeof(\"\")         = %u\n",	(unsigned)sizeof(""));
	printf("sizeof(\"opq\")      = %u\n",	(unsigned)sizeof("opq"));
	printf("sizeof(\"rs\\tt\")    = %u\n",	(unsigned)sizeof("rs\tt"));
	printf("sizeof(\"uvw\\0xyz\") = %u\n",	(unsigned)sizeof("uvw\0xyz"));

	return (0);
}