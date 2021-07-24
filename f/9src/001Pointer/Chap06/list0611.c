/*
	offsetof궻믦?쀡
*/

#define	offsetof(s, mem)	(size_t)&(((s *)0)->mem)
