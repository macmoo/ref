/*
	�j����\���p�P��̊w�K�i�|�C���^�̔z��Łj
*/

#include  <stdio.h>

/*--- �j���ɑΉ����镶�����Ԃ��i�|�C���^�̔z��Łj ---*/
char *weekstr(int wd)
{
	char *wptr[] = {
		"sunday", "monday", "tuesday", "wednesday",
		"thursday", "friday", "saturday"
	};
	return ((wd >= 0 && wd < 7) ? wptr[wd] : NULL);
}

int main(void)
{
	int	 n;
	int	 retry;

	puts("�j����\���p�P����w�K���܂��傤�B");

	do {
		printf("0-���j���^1-���j���^�c�^6-�y�j���F");
		scanf("%d", &n);

		printf("�p��ł�%s�ł��B\n", weekstr(n));

		printf("������x�H 0-�������^1-�͂��F");
		scanf("%d", &retry);
	} while (retry == 1);

	return (0);
}