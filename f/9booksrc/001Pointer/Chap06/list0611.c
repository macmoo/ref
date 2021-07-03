/*
	offsetof‚Ì’è‹`—á
*/

#define	offsetof(s, mem)	(size_t)&(((s *)0)->mem)
