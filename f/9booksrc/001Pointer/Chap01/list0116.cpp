/*
	��̐����l�������i�b++�j
*/

#include  <iostream>

using namespace	 std;

//--- x��y�̒l������ ---//
void swap(int& x, int& y)
{
	int	 temp = x;
	x = y;
	y = temp;
}

int main(void)
{
	int	 a, b;

	cout << "��̐�������͂��Ă��������B\n";
	cout << "�����`�F";	  cin >> a;
	cout << "�����a�F";	  cin >> b;

	swap(a, b);

	cout << "�����`�Ƃa�̒l���������܂����B\n";
	cout << "�`�̒l��" << a << "�ł��B\n";
	cout << "�a�̒l��" << b << "�ł��B\n";

	return (0);
}