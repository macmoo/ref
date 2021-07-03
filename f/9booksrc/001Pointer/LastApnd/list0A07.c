/*
	�ėp�X�^�b�N�̗��p��
*/

#include  <stdio.h>
#include  "stack.h"

int main(void)
{
	Stack  *s;		/* �X�^�b�N */

	/* �ő�100�v�b�V���ł���double�^�X�^�b�N */
	if ((s = StackAlloc(sizeof(double), 100)) == NULL) {
		puts("�X�^�b�N�̍쐬�Ɏ��s���܂����B");
		return (1);
	}

	while (1) {
		int		m;
		double	x;

		printf("���݂̃f�[�^���F%d/%d\n", StackNo(s), StackSize(s));
		printf("(1) �v�b�V���@(2) �|�b�v�@(3) �s�[�N�@(4) ��ɂ���@(0) �I���F");
		scanf("%d", &m);

		if (m == 0) break;

		switch (m) {
		 case 1: printf("�f�[�^�F");
				 scanf("%lf", &x);
				 if (StackPush(s, &x) == -1)
					puts("�X�^�b�N�ւ̃v�b�V���Ɏ��s���܂����B");	break;

		 case 2: if (StackPop(s, &x) == -1)
					puts("�|�b�v�ł��܂���B");
				 else
					printf("�|�b�v�����f�[�^��%f�ł��B\n", x);		break;

		 case 3: if (StackPeek(s, &x) == -1)
					puts("�s�[�N�ł��܂���B");
				 else
					printf("�s�[�N�����f�[�^��%f�ł��B\n", x);		break;

		 case 4: StackClear(s);										break;

		}
	}

	StackFree(s);

	return (0);
}
