/*
	《ポインタによる文字列》の配列
*/

#include  <stdio.h>

int main(void)
{
	int	  i;
	char  *ptr[] = {"W140", "S", "500"};

	for (i = 0; i < 3; i++)
		printf("ptr[%d] = \"%s\"\n", i, ptr[i]);

	return (0);
}