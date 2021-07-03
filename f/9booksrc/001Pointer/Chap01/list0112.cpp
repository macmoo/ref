/*
	register記憶域クラス指定子付きで宣言されたオブジェクトのアドレス（Ｃ++）
*/

#include  <iostream>

using namespace	 std;

int main(void)
{
	register int  nx;

	cout << "&nxの値は" << &nx << "です。\n";		/* ＯＫ！ */

	return (0);
}