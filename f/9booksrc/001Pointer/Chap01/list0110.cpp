/*
	�|�C���^�̏������i�b++�j
*/

#include  <iostream>

using namespace	 std;

int main(void)
{
	int	 nx = 100;		// nx�̒l��100
	int	 ny = 200;		// ny�̒l��200
	int* px = &nx;		// px��nx���w���|�C���^
	int* py = &ny;		// py��ny���w���|�C���^

	cout << " nx�̒l��" << nx << '\n';		// nx�̒l
	cout << " ny�̒l��" << ny << '\n';		// ny�̒l
	cout << "*px�̒l��" << *px << '\n';		// px���w���I�u�W�F�N�g�̒l
	cout << "*py�̒l��" << *py << '\n';		// py���w���I�u�W�F�N�g�̒l

	return (0);
}