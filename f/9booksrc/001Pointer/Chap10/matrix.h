/*
	行列演算ライブラリ用ヘッダ	"matrix.h"
*/

#if !defined(___LIB_MATRIX_DEF_)
#define ___LIB_MATRIX_DEF_

typedef struct {
	int		m;		/* 行数 */
	int		n;		/* 列数 */
	double	*x;		/* 配列本体 */
} MAT;

/*--- 列数 ---*/
#define	MATwidth(mat)		((mat).n)

/*--- 行数 ---*/
#define	MATheight(mat)		((mat).m)

/*--- i行j列の要素 ---*/
#define	MATelem(mat, i, j)	((mat).x[(i - 1) * MATwidth(mat) + (j) - 1])

/*--- 行列m1とm2は同じ大きさか ---*/
#define	MATsizeEQ(m1, m2)	(((m1).n == (m2).n) && ((m1).m == (m2).m))

/*--- 行列m1とm2は乗算できる大きさか ---*/
#define MATmulable(m1, m2)	(((m1).n == (m2).m) && ((m1).m == (m2).n))

extern double	MATeps;

/*--- 加算（mat1 ← mat2 + mat3） ---*/
int MATadd(MAT *mat1, const MAT *mat2, const MAT *mat3);

/*--- m行n列の記憶域を確保 ---*/
int	 MATalloc(MAT *mat, int m, int n);

/*--- 代入（mat1 ← mat2） ---*/
int MATassign(MAT *mat1, const MAT *mat2);

/*--- matを零行列化 ---*/
void MATclear(MAT *mat);

/*--- スカラー倍（mat ← c * mat） ---*/
void MATcmul(MAT *mat, double c);

/*--- 記憶域を解放 ---*/
void MATfree(MAT *mat);

/*--- １次方程式（ガウスの消去法） ---*/
int	 MATgauss(MAT *a, const MAT *x);

/*--- 逆行列 ---*/
int	 MATinvgauss(MAT *ia, const MAT *x);

/*--- 乗算（mat1 ← mat2 * mat3） ---*/
int MATmul(MAT *mat1, const MAT *mat2, const MAT *mat3);

/*--- matを単位行列化 ---*/
int MATsquare(MAT *mat);

/*--- 減算（mat1 ← mat2 - mat3） ---*/
int MATsub(MAT *mat1, const MAT *mat2, const MAT *mat3);

/*--- 転置行列 ---*/
int MATtransport(MAT *mat1, const MAT *mat2);

#endif
