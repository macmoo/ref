/*
	�\���̂̃����o�̃I�t�Z�b�g��\��
*/

#include  <stdio.h>
#include  <stddef.h>

#undef offsetof

#define	offsetof(s, mem)	(size_t)&(((s *)0)->mem)

int main(void)
{
	struct abc {
		char  a;
		int	  b;
		long  c;
	} x;

	printf("a�̃I�t�Z�b�g��%u\n", (unsigned)offsetof(struct abc, a));
	printf("b�̃I�t�Z�b�g��%u\n", (unsigned)offsetof(struct abc, b));
	printf("c�̃I�t�Z�b�g��%u\n", (unsigned)offsetof(struct abc, c));

	return (0);
}
