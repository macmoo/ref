/*
	�\���̂̑傫���ƃ����o�̑傫���̍��v��\��
*/

#include  <stdio.h>

int main(void)
{
	struct abc {
		char  a;
		int	  b;
		long  c;
	} x;

	printf("sizeof(x) = %u\n", (unsigned)sizeof(x));
	printf("sizeof(x.a) + sizeof(x.b) + sizeof(x.c) = %u\n",
					(unsigned)(sizeof(x.a) + sizeof(x.b) + sizeof(x.c)));

	return (0);
}
