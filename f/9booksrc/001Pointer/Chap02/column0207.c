/*
	�I�u�W�F�N�g�̋L������ԂƏ�����
*/

#include  <stdio.h>

int	 ft = 0;				/* �ÓI�L������� */

void func(void)
{
	int			at = 0;		/* �����L������� */
	static int	st = 0;		/* �ÓI�L������� */

	ft++;
	at++;
	st++;
	printf("ft = %d  at = %d  st = %d\n", ft, at, st);
}

int main(void)
{
	int	 i;

	for (i = 0; i < 8; i++)
		func();

	return (0);
}