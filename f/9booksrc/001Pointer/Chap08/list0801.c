/*
	�d�b�A����̕\��
*/

#include  <stdio.h>

/*--- �d�b�A�����\���\���̂̔z�� ---*/
struct List {
	char  name[20];		/* ���O */
	char  tel[16];		/* �d�b�ԍ� */
	int	  next;			/* ���̉�� */
} data[6] = {
	"�ēc�]�m", "999-2536-1296",  3,
	"�r�c�K��", "999-5351-5298",  0,
	"���c�a�G", "999-1245-2538", -1,
	"����ɔV", "999-3978-4593",  2,
	"",			"",				  0,
	"",			"",				  0,
};

int	 top = 1;					/* �ŏ��ɓd�b���������� */

int main(void)
{
	int	 now;					/* ���ݒ��ڂ��Ă����� */

	puts("--- �d�b�A���� ---");

	now = top;
	while (now != -1) {
		printf("%s�s%s�t\n", data[now].name, data[now].tel);
		now = data[now].next;
	}

	return (0);
}