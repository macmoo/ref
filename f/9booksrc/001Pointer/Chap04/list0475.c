/*
	���t��ǂݍ���
*/

#include  <stdio.h>
#include  <string.h>

/*--- ���t��\���\���� ---*/
typedef struct {
	int	 y;
	int	 m;
	int	 d;
} Date;

/*--- ���t��ǂݍ��� -----------------
  �T�|�[�g�`���F2001/11/18
				2001-11-18
				18 November 2001
------------------------------------*/
int fgetdate(Date *d, FILE *fp)
{
	char  *month[] = {"", "January", "February", "March", "April",
					  "May", "June", "July", "August", "September",
					  "October", "November", "December" };
	char  buf[256], mbuf[16];

	d->y = d->m = d->d = 0;

	if (fgets(buf, sizeof(buf), fp) != NULL) {
		if (sscanf(buf, "%d/%d/%d", &d->y, &d->m, &d->d) == 3)
			return (1);
		else if (sscanf(buf, "%d-%d-%d", &d->y, &d->m, &d->d) == 3)
			return (1);
		else if (sscanf(buf, "%d%s%d", &d->d, mbuf, &d->y) == 3) {
			int	 i;
			for (i = 1; i <= 12; i++)
				if (strncmp(month[i], mbuf, 3) == 0) {
					d->m = i;
					return (1);
				}
		}
	}
	return (0);
}

int main(void)
{
	Date  date;

	puts("���t����͂��Ă��������B");

	while (fgetdate(&date, stdin))
		printf("���t�F%d-%d-%d\n\n", date.y, date.m, date.d);

	return (0);
}