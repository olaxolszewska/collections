package com.lhsystems.collections;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ListTest {

	@Test
	public void testAdd() {
		List<Person> list = new OlaList<Person>();
		
		boolean actual = list.add(new Person("Maciej", "Laskowski", 11));
 
		assertThat(actual, is(true));
	}

	@Test
	public void testSize() {
		List<Person> list = new OlaList<Person>();
		assertThat(list.size(), is(0));
		list.add(new Person("Maciej", "Laskowski", 11));
		assertThat(list.size(), is(1));
	}
	
	@Test
	public void testRemove() {
		List<Person> list = new OlaList<Person>();
		Person maciek = new Person("Maciej", "Laskowski", 11);
		
		list.add(maciek);
	
		boolean actual = list.remove(maciek);
		
		assertThat(actual, is(true));
		assertThat(list.size(), is(0));
	}	
}
