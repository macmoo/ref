/*
	�s�񉉎Z���C�u�����p�w�b�_	"matrix.h"
*/

#if !defined(___LIB_MATRIX_DEF_)
#define ___LIB_MATRIX_DEF_

typedef struct {
	int		m;		/* �s�� */
	int		n;		/* �� */
	double	*x;		/* �z��{�� */
} MAT;

/*--- �� ---*/
#define	MATwidth(mat)		((mat).n)

/*--- �s�� ---*/
#define	MATheight(mat)		((mat).m)

/*--- i�sj��̗v�f ---*/
#define	MATelem(mat, i, j)	((mat).x[(i - 1) * MATwidth(mat) + (j) - 1])

/*--- �s��m1��m2�͓����傫���� ---*/
#define	MATsizeEQ(m1, m2)	(((m1).n == (m2).n) && ((m1).m == (m2).m))

/*--- �s��m1��m2�͏�Z�ł���傫���� ---*/
#define MATmulable(m1, m2)	(((m1).n == (m2).m) && ((m1).m == (m2).n))

extern double	MATeps;

/*--- ���Z�imat1 �� mat2 + mat3�j ---*/
int MATadd(MAT *mat1, const MAT *mat2, const MAT *mat3);

/*--- m�sn��̋L������m�� ---*/
int	 MATalloc(MAT *mat, int m, int n);

/*--- ����imat1 �� mat2�j ---*/
int MATassign(MAT *mat1, const MAT *mat2);

/*--- mat���s�� ---*/
void MATclear(MAT *mat);

/*--- �X�J���[�{�imat �� c * mat�j ---*/
void MATcmul(MAT *mat, double c);

/*--- �L�������� ---*/
void MATfree(MAT *mat);

/*--- �P���������i�K�E�X�̏����@�j ---*/
int	 MATgauss(MAT *a, const MAT *x);

/*--- �t�s�� ---*/
int	 MATinvgauss(MAT *ia, const MAT *x);

/*--- ��Z�imat1 �� mat2 * mat3�j ---*/
int MATmul(MAT *mat1, const MAT *mat2, const MAT *mat3);

/*--- mat��P�ʍs�� ---*/
int MATsquare(MAT *mat);

/*--- ���Z�imat1 �� mat2 - mat3�j ---*/
int MATsub(MAT *mat1, const MAT *mat2, const MAT *mat3);

/*--- �]�u�s�� ---*/
int MATtransport(MAT *mat1, const MAT *mat2);

#endif
