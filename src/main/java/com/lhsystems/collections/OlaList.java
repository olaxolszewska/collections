package com.lhsystems.collections;

public class OlaList<E> implements List<E> {

	private Object[] elements;
	private int lastPosition;

	public OlaList() {
		elements = new Object[10];
		lastPosition = 0;
	}

	public int size() {
		return lastPosition;
	}

	public boolean add(E e) {
		elements[lastPosition] = e;
		lastPosition++;
		return true;
	}

	public boolean remove(Object o) {
		 for(int i = 0; i < elements.length; i++) {
			 if(elements[i] == o && elements[i].equals(o)) {
				// 
			 }
		 }
		
		return false;
	}

	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
