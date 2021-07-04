/* 演習5-5の解答例 */

#include  <errno.h>
#include  <stdio.h>
#include  <stdlib.h>

int main(int argc, char **argv)
{
	char	str[100];
	char	*ptr = str;
	double	sum = 0.0;

	while (--argc > 0) {
		double	x = strtod(*++argv, &ptr);
		if (errno != ERANGE  &&  ptr != str)
			sum += x;
	} 

	printf("%f\n", sum);

	return (0);
}
