/*
	int�^��int *�^�̑傫����\��
*/

#include  <stdio.h>

int main(void)
{
	int	 nx;		/* int�^ */
	int	 *pt;		/* int *�^ */

	printf("int  �^��%u�o�C�g�ł��B\n",	(unsigned)sizeof(int));
	printf("int *�^��%u�o�C�g�ł��B\n",	(unsigned)sizeof(int *));

	printf(" nx��%u�o�C�g�ł��B\n",	(unsigned)sizeof(nx));
	printf("*pt��%u�o�C�g�ł��B\n",	(unsigned)sizeof(*pt));
	printf(" pt��%u�o�C�g�ł��B\n",	(unsigned)sizeof(pt));
	printf("&nx��%u�o�C�g�ł��B\n",	(unsigned)sizeof(&nx));

	return (0);
}