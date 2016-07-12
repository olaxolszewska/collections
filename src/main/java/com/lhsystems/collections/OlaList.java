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
		if (lastPosition == elements.length) {
			Object[] newElements = new Object[elements.length * 2];
			for (int i = 0; i < elements.length; i++) {
				newElements[i] = elements[i];
			}
			elements = newElements;
		}
		elements[lastPosition] = e;
		lastPosition++;
		return true;
	}

	public boolean remove(Object toRemove) {
		for (int i = 0; i < lastPosition; i++) {
			if (elements[i] == toRemove || elements[i].equals(toRemove)) {
				Object[] newElements = new Object[elements.length];
				int newIndex = 0;
				for (int k = 0; k < lastPosition; k++) {
					if (k == i) {
						newIndex = 1;
						continue;
					}
					newElements[k - newIndex] = elements[k];
				}
				elements = newElements;
				lastPosition--;
				return true;
			}
		}
		return false;
	}

	public E get(int index) {
		if (index >= lastPosition) {
			return null;
		}

		return (E) elements[index];
	}

}
