/*
	�z��̗v�f�̒l�ƃA�h���X��\��
*/

#include  <stdio.h>

int main(void)
{
	int	 i;
	int	 a[5] = {1, 2, 3, 4, 5};
	int	 *p = a;					/* p��a[0]���w�� */

	for (i = 0; i < 5; i++)			/* �v�f�̒l��\�� */
		printf("a[%d] = %d  *(a+%d) = %d  p[%d] = %d  *(p+%d) = %d\n",
								i, a[i], i, *(a + i), i, p[i], i, *(p + i));

	for (i = 0; i < 5; i++)			/* �v�f�ւ̃|�C���^��\�� */
		printf("&a[%d] = %d  a+%d = %d  &p[%d] = %d  p+%d = %d\n",
								i, &a[i], i, a + i, i, &p[i], i, p + i);
	return (0);
}