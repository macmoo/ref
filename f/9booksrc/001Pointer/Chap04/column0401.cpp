#include  <iostream>

using namespace	 std;

void func(char x)
{
	cout << "func(char)���Ăяo����܂����B\n";
}

void func(int x)
{
	cout << "func(int)���Ăяo����܂����B\n";
}

int main(void)
{
	func('A');		// func(char)���Ăяo�����

	return (0);
}