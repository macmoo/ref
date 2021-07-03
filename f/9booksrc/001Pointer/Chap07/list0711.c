/*
	height�swidth��̂Q�����z��i���ǂ��j�𓮓I�Ɋm��
*/

#include  <stdio.h>
#include  <stdlib.h>

int main(void)
{
	int	 height, width;		/* �s���Ɨ� */
	int	 **p;

	printf("�s���F");	scanf("%d", &height);
	printf("�񐔁F");	scanf("%d", &width);

	p = (int **)calloc(height, sizeof(int *));

	if (p == NULL) 
		puts("�L����̊m�ۂɎ��s���܂����B");
	else {
		int	 i, j;

		for (i = 0; i < height; i++)
			p[i] = NULL;

		for (i = 0; i < height; i++) {
			p[i] = (int *)calloc(width, sizeof(int)); 
			if (p[i] == NULL) {
				puts("�L����̊m�ۂɎ��s���܂����B");
				goto Free;
			}
		}
		for (i = 0; i < height; i++)		/* �S�v�f��0���� */
			for (j = 0; j < width; j++)
				p[i][j] = 0;

		for (i = 0; i < height; i++)		/* �S�v�f�̒l��\�� */
			for (j = 0; j < width; j++)
				printf("p[%d][%d] = %d\n", i, j, p[i][j]);
Free:
		for (i = 0; i < height; i++)
			free(p[i]);
		free(p);
	}
	return (0);
}