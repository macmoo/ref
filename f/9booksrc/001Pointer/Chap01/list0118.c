/*
	����'*'��A�����ĕ\���i��Q�Łj
*/

#include  <stdio.h>

/*--- ����'*'��no�A�����ĕ\�� ---*/
void put_stars(int no)
{
	while (no-- > 0)
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