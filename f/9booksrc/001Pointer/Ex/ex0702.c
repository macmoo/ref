/* ‰‰K7-2‚Ì‰ð“š—á */

void *recalloc(void *ptr, size_t size, size_t old_size)
{
	void  *tmp;

	if (size == 0)
		return (NULL);
	tmp = realloc(ptr, size);
	if (tmp != NULL  &&  size > old_size)
		memset((char *)tmp + old_size, 0, (size - old_size));

	return (tmp);
}
