/*
	int�^�̗L���r�b�g����\��
*/

#include  <stdio.h>

/*--- int�^�^unsigned int�^�̃r�b�g����Ԃ� ---*/
int int_bits(void)
{
	int		  count = 0;
	unsigned  x = ~0U;

	while (x) {
		if (x & 1U) count++;
		x >>= 1;
	}
	return (count);
}

int main(void)
{
	printf("int�^�̗L���r�b�g��%d�r�b�g�ł��B\n", int_bits());

	return (0);
}
