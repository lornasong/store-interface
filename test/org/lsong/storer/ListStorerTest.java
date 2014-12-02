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

public class ListStorerTest {
//ECL Emma helps with class coverage
	//You can write methods to specifically increase coverage.
	//gives idea of what testing
	//not so much if you are testing well
	//e.g. all branches of different combinations in an if statement
	
	@Test
	public void test1DeleteFromEmptyList() {
		ListStorer testList = new ListStorer();
		// NOTE: Can make a new class for this. Run test independently.
		// feed a lot of values.
		assertFalse("Should have deleted string from empty list",
				testList.delete("test"));
		// put as many asserts as needed
		// Language of note: what does this mean for this to fail
	}

	@Test
	public void test2AddDuplicateValues() {
		ListStorer testList = new ListStorer();
		testList.add("duplicate");
		assertTrue("Prevented adding duplicate valudes",
				testList.add("duplicate"));
	}

//	@Test
//	public void testAdd() {
//		ListStorer testList = new ListStorer();
//		String addString = "add";
//		assertTrue("Should have added string", testList.add(addString));
//		assertTrue("Should have deleted string", testList.delete(addString));
//	}
	
	

}
