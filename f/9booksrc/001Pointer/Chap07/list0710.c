/*
	height�s3��̂Q�����z����m��
*/

#include  <stdio.h>
#include  <stdlib.h>

int main(void)
{
	int	 height;		/* �s�� */
	int	 (*p)[3];		/* �񐔂͒萔�i�����ł�3�j */

	printf("�s���F");
	scanf("%d", &height);

	p = (int (*)[3])calloc(height * 3, sizeof(int));

	if (p == NULL)
		puts("�L����̊m�ۂɎ��s���܂����B");
	else {
		int	 i, j;

		for (i = 0; i < height; i++)		/* �S�v�f��0���� */
			for (j = 0; j < 3; j++)
				p[i][j] = 0;

		for (i = 0; i < height; i++)		/* �S�v�f�̒l��\�� */
			for (j = 0; j < 3; j++)
				printf("p[%d][%d] = %d\n", i, j, p[i][j]);

		free(p);
	}

	return (0);
}