package com.lhsystems.collections;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.nullValue;

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
		Person figa = new Person("Figa", "Laskowska", 14);
		Person ola = new Person("Ola", "Olszewska", 28);

		list.add(maciek);
		list.add(figa);
		list.add(ola);

		boolean actual = list.remove(maciek);

		assertThat(actual, is(true));
		assertThat(list.size(), is(2));
	}

	@Test
	public void testGet() {
		List<Person> list = new OlaList<Person>();
		Person maciek = new Person("Maciej", "Laskowski", 11);
		Person figa = new Person("Figa", "Laskowska", 14);
		Person ola = new Person("Ola", "Olszewska", 28);

		list.add(maciek);
		list.add(figa);
		list.add(ola);

		Person person = list.get(1);

		assertThat(person.getName(), is("Figa"));
		assertThat(list.get(100), is(nullValue()));

	}

}
