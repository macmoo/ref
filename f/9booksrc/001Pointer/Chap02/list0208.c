/*
	�z��̎�n��
*/

#include  <stdio.h>

/*--- �z��v�f�̐擪���珇��1,2,3���i�[ ---*/
void set123(int *a)
{
	*a		 = 1;			/* a[0] = 1; */
	*(a + 1) = 2;			/* a[1] = 2; */
	*(a + 2) = 3;			/* a[2] = 3; */
}

int main(void)
{
	int	 x[5];		/* �v�f�^��int�^�ŗv�f����5�̔z�� */

	set123(x);

	printf("x[0] = %d\n", x[0]);		/* x[0]�̒l��\�� */
	printf("x[1] = %d\n", x[1]);		/* x[1]�̒l��\�� */
	printf("x[2] = %d\n", x[2]);		/* x[2]�̒l��\�� */

	return (0);
}