/*
	引数とスタック
*/

#include  <stdio.h>

/*--- 三つの引数を受け取る関数 ---*/
void func(int a, long b, char *c)
{
	int	  x;
	long  y;
	
	/* … */

}

int main(int argc, char *argv[])
{
	int	  a = 1;
	char  s[] = "abc";
	
	func(a + 3, 2, s);

	return (0);
}