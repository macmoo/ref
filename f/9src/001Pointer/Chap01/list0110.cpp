/*
	ポインタの初期化（Ｃ++）
*/

#include  <iostream>

using namespace	 std;

int main(void)
{
	int	 nx = 100;		// nxの値は100
	int	 ny = 200;		// nyの値は200
	int* px = &nx;		// pxはnxを指すポインタ
	int* py = &ny;		// pyはnyを指すポインタ

	cout << " nxの値＝" << nx << '\n';		// nxの値
	cout << " nyの値＝" << ny << '\n';		// nyの値
	cout << "*pxの値＝" << *px << '\n';		// pxが指すオブジェクトの値
	cout << "*pyの値＝" << *py << '\n';		// pyが指すオブジェクトの値

	return (0);
}