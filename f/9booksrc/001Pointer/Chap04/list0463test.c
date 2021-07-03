/*
	memset�֐��̗��p��i���̂P�j
*/

#include  <stdio.h>
#include  <string.h>

/*--- memset�̎����� ---*/
void *memset(void *s, int c, size_t n)
{
	const unsigned char	 uc = c;
	unsigned char		 *p = (unsigned char *)s;

	while (n-- > 0)
		*p++ = uc;

	return (s);
}

/*--- p��擪�Ƃ���n�o�C�g�̋L����̓��e��16�i���ŕ\�� ---*/
void put_bin(const char *p, size_t n)
{
	size_t	i;

	for (i = 0; i < n; i++)
		printf("%02X ", (unsigned char)p[i]);
}

int main(void)
{
	char  str[] = "ABCDEFG";
	int	  ns = sizeof(str);

	printf("str : ");
	put_bin(str, ns);		/* �z��str�̓��e��16�i���ŕ\�� */

	memset(str, 0, ns);		/* �z��str�̑S�o�C�g��0���� */

	printf("\n�S�o�C�g��0�������܂����B\n");
	printf("str : ");
	put_bin(str, ns);		/* �z��str�̓��e��16�i���ŕ\�� */

	return (0);
}