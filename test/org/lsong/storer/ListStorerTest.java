package org.lsong.storer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * JUnit Test add() and delete() in ListStorer. Plays with test order so that
 * deleteFromEmptyList is tested first.
 * 
 * @author lornasong
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ListStorerTest {

	private ListStorer testList;

	@Before
	public void initTestClass() {
		testList = new ListStorer();
	}

	@Test
	public void test1DeleteFromEmptyList() {
		assertFalse("Deleted string from empty list", testList.delete("test"));
	}

	@Test
	public void test2AddDuplicateValues() {
		testList.add("duplicate");
		assertTrue("Prevented adding duplicate valudes",
				testList.add("duplicate"));
	}

}
