package com.lhsystems.collections;

public interface Set<E> {

	/**
	 * Return elements count.
	 * 
	 * @return
	 */
	public int size();

	/**
	 * Add element.
	 * 
	 * @param e
	 * @return
	 */
	boolean add(E e);

	/**
	 * Removes object from list
	 * 
	 * @param o
	 * @return
	 */
	boolean remove(Object o);

	/**
	 * return element for given index
	 * 
	 * @param index
	 * @return
	 */
	public E get(int index);

}
