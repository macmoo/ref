/*
	�|�C���^�̏�����
*/

#include  <stdio.h>

int main(void)
{
	int	 nx = 100;		/* nx�̒l��100 */
	int	 ny = 200;		/* ny�̒l��200 */
	int	 *px = &nx;		/* px��nx���w���|�C���^ */
	int	 *py = &ny;		/* py��ny���w���|�C���^ */

	printf(" nx�̒l��%d\n",	 nx);	/* nx�̒l */
	printf(" ny�̒l��%d\n",	 ny);	/* ny�̒l */
	printf("*px�̒l��%d\n", *px);	/* px���w���I�u�W�F�N�g�̒l */
	printf("*py�̒l��%d\n", *py);	/* py���w���I�u�W�F�N�g�̒l */

	return (0);
}