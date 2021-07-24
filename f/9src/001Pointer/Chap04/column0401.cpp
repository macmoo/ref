#include  <iostream>

using namespace	 std;

void func(char x)
{
	cout << "func(char)が呼び出されました。\n";
}

void func(int x)
{
	cout << "func(int)が呼び出されました。\n";
}

int main(void)
{
	func('A');		// func(char)が呼び出される

	return (0);
}