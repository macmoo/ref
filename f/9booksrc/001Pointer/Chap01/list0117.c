/*
	����'*'��A�����ĕ\���i��P�Łj
*/

#include  <stdio.h>

/*--- ����'*'��no�A�����ĕ\�� ---*/
void put_stars(int no)
{
	int	 i;

	for (i = 0; i < no; i++)
		putchar('*');
}

int main(void)
{
	int	 count;

	printf("���\�����܂����F");
	scanf("%d", &count);

	put_stars(count);

	printf("\n%d�\�����܂����B\n", count);

	return (0);
}