/*
	������̔z��𓮓I�ɐ���
*/

#include  <stdio.h>
#include  <stdlib.h>
#include  <string.h>

int main(void)
{
	int	  num;			/* ������̌� */
	char  **pt;

	printf("������͉��F");
	scanf("%d", &num);

	pt = (char **)calloc(num, sizeof(char *));

	if (pt == NULL) 
		puts("�L����̊m�ۂɎ��s���܂����B");
	else {
		int	 i;

		for (i = 0; i < num; i++)
			pt[i] = NULL;

		for (i = 0; i < num; i++) {
			char  temp[128];

			printf("p[%d] : ", i);
			scanf("%s", temp);

			pt[i] = (char *)malloc(strlen(temp) + 1);

			if (pt[i] == NULL) {
				puts("�L����̊m�ۂɎ��s���܂����B");
 				goto Free;
			} else 
				strcpy(pt[i], temp);
		}
		for (i = 0; i < num; i++)
			printf("pt[%d] = %s\n", i, pt[i]);
Free:
		for (i = 0; i < num; i++)
			free(pt[i]);					/* �L�������� */
		free(pt);
	}
	return (0);
}