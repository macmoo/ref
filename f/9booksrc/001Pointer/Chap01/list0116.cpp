/*
	二つの整数値を交換（Ｃ++）
*/

#include  <iostream>

using namespace	 std;

//--- xとyの値を交換 ---//
void swap(int& x, int& y)
{
	int	 temp = x;
	x = y;
	y = temp;
}

int main(void)
{
	int	 a, b;

	cout << "二つの整数を入力してください。\n";
	cout << "整数Ａ：";	  cin >> a;
	cout << "整数Ｂ：";	  cin >> b;

	swap(a, b);

	cout << "整数ＡとＢの値を交換しました。\n";
	cout << "Ａの値は" << a << "です。\n";
	cout << "Ｂの値は" << b << "です。\n";

	return (0);
}