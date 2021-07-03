/*
	行列演算ライブラリ		"matrix.c"
*/

#include  <math.h>
#include  <stdio.h>
#include  <stdlib.h>
#include  "matrix.h"

/*--- type型x,yの値を交換する ---*/
#define	 swap(type, x, y)	do { type t = x; x = y; y = t; } while (0)

double	MATeps = 1.0E-6;

/*--- m行n列の記憶域を確保 ---*/
int MATalloc(MAT *mat, int m, int n)
{
	if ((mat->x = (double *)calloc(m * n , sizeof(double))) != NULL) {
		MATwidth( *mat) = n;
		MATheight(*mat) = m;
		return (0);
	}
	MATwidth(*mat) = MATheight(*mat) = 0;
	return (-1);
}

/*--- 記憶域を解放 ---*/
void MATfree(MAT *mat)
{
	free(mat->x);
}

/*--- matを零行列化 ---*/
void MATclear(MAT *mat)
{
	int	 i, j;

	for (i = 1; i <= MATheight(*mat); i++)
		for (j = 1; j <= MATwidth(*mat); j++)
			MATelem(*mat, i, j) = 0.0;
}

/*--- matを単位行列化 ---*/
int MATsquare(MAT *mat)
{
	int	 i;

	if (MATwidth(*mat) != MATheight(*mat))
		return (-1);

	MATclear(mat);
	for (i = 1; i <= MATwidth(*mat); i++)
		MATelem(*mat, i, i) = 1.0;
	return (0);
}

/*--- 代入（mat1 ← mat2） ---*/
int MATassign(MAT *mat1, const MAT *mat2)
{
	int	 i, j;

	if (!MATsizeEQ(*mat1, *mat2))
		return(-1);

	for (i = 1; i <= MATheight(*mat1); i++)
		for (j = 1; j <= MATwidth(*mat1); j++)
			MATelem(*mat1, i, j) = MATelem(*mat2, i, j);

	return (0);
}

/*--- 加算（mat1 ← mat2 + mat3） ---*/
int MATadd(MAT *mat1, const MAT *mat2, const MAT *mat3)
{
	int	 i, j;

	if (!MATsizeEQ(*mat1, *mat2))
		return (-1);

	for (i = 1; i <= MATheight(*mat1); i++)
		for (j = 1; j <= MATwidth(*mat1); j++)
			MATelem(*mat1,i,j) = MATelem(*mat2,i,j) + MATelem(*mat3,i,j);

	return (0);
}

/*--- 減算（mat1 ← mat2 - mat3） ---*/
int MATsub(MAT *mat1, const MAT *mat2, const MAT *mat3)
{
	int	 i, j;

	if (!MATsizeEQ(*mat1, *mat2))
		return (-1);

	for (i = 1; i <= MATheight(*mat1); i++)
		for (j = 1; j <= MATwidth(*mat1); j++)
			MATelem(*mat1,i,j) = MATelem(*mat2,i,j) - MATelem(*mat3,i,j);

	return (0);
}

/*--- スカラー倍（mat ← c * mat） ---*/
void MATcmul(MAT *mat, double c)
{
	int	 i, j;

	for (i = 1; i <= MATheight(*mat); i++)
		for (j = 1; j <= MATwidth(*mat); j++)
				MATelem(*mat, i, j) *= c;

}

/*--- 乗算（mat1 ← mat2 * mat3） ---*/
int MATmul(MAT *mat1, const MAT *mat2, const MAT *mat3)
{
	int		i, j, k;
	double	sum;

	if (!MATmulable(*mat1, *mat2))
		return (-1);

	for (i = 1; i <= MATheight(*mat2); i++) { 
		for (j = 1; j <= MATwidth(*mat3); j++) {
			sum = 0.0;
			for (k = 1; k <= MATwidth(*mat2); k++)
				sum += MATelem(*mat2, i, k) * MATelem(*mat3, k, j);
			MATelem(*mat1, i, j) = sum;
		}
	}

	return (0);
}

/*--- １次方程式（ガウスの消去法） ---*/
int MATgauss(MAT *a, const MAT *x)
{
	int		i, j, k, mx;
	double	t;

	for (k = 1; k <= MATwidth(*a) - 2; k++) {
		for (i = k + 1, mx = k; i <= MATheight(*a); i++)
			if (fabs(MATelem(*a, i, k)) > fabs(MATelem(*a, mx, k)))
				mx = i;
		if (fabs(MATelem(*a, mx, k)) < MATeps)
			return (-1);
		if (mx != k)
			for (j = k; j <= MATwidth(*a); j++)
				swap(double, MATelem(*a, k, j), MATelem(*a, mx, j));
		for (i = k + 1; i <= MATwidth(*a) - 1; i++) {
			t = MATelem(*a, i, k) / MATelem(*a, k, k);
			for (j = k + 1; j <= MATwidth(*a); j++)
				MATelem(*a, i, j) -= t * MATelem(*a, k, j);
		}
	}

	for (k = MATwidth(*a) - 1; k >= 1; k--) {
		MATelem(*a, k, MATwidth(*a)) /= MATelem(*a, k, k);
		for (i = k - 1; i >= 1; i--)
			MATelem(*a, i, MATwidth(*a)) -=
							MATelem(*a, k, MATwidth(*a)) * MATelem(*a, i, k);
	}

	for (k = 1; k <= MATheight(*a); k++)
		MATelem(*x, k, 1) = MATelem(*a, k, MATwidth(*a));

	return (0);
}

/*--- 逆行列 ---*/
int MATinvgauss(MAT *ia, const MAT *x)
{
	int		i, j, k, n, mx;
	double	tmp;
	MAT		a;

	n = MATheight(*ia);
	if (MATalloc(&a, n, n) == -1)
		return (-2);

	MATassign(&a, x);
	for (i = 1; i <= n; i++) {
		for (j = 1; j <= n; j++)
			MATelem(*ia, i, j) = 0.0;
		MATelem(*ia, i, i) = 1.0;
	}

	for (k = 1; k <= n - 1; k++) {
		for (i = k + 1, mx = k; i <= n; i++)
			if (fabs(MATelem(a, i, k)) > fabs(MATelem(a, mx, k)))
				mx = i;

		if (fabs(MATelem(a, mx, k)) < MATeps) {
			MATfree(&a);
			return (-1);
		}

		if (mx != k) {
			for (j = k; j <= n; j++)
				swap(double, MATelem(  a, k, j), MATelem(  a, mx, j));
			for (j = 1; j <= n; j++)
				swap(double, MATelem(*ia, k, j), MATelem(*ia, mx, j));
		}

		for (i = k + 1; i <= n; i++) {
			tmp = MATelem(a, i, k) / MATelem(a, k, k);
			for (j = 1; j <= n; j++)
				MATelem(  a, i, j) -= tmp * MATelem(  a, k, j);
			for (j = 1; j <= n; j++)
				MATelem(*ia, i, j) -= tmp * MATelem(*ia, k, j);
		}
	}

	for (k = n; k >= 1; k--) {
		for (j = 1; j <= n; j++)
			MATelem(*ia, k, j) /= MATelem(a, k, k);
		for (i = k - 1; i >= 1; i--)
			for (j = 1; j <= n; j++)
				MATelem(*ia, i, j) -= MATelem(*ia, k, j) * MATelem(a, i, k);
	}
	MATfree(&a);

	return (0);
}

/*--- 転置行列 ---*/
int MATtransport(MAT *mat1, const MAT *mat2)
{
	int	 i, j;

	if (!MATmulable(*mat1, *mat2))
		return (-1);

	for (i = 1; i <= MATheight(*mat2); i++)
		for (j = 1; j <= MATwidth(*mat2); j++)
			MATelem(*mat1, j, i) = MATelem(*mat2, i, j);

	return (0);
}
