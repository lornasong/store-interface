package org.lsong.storer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit Test delete() and add() for SetStorer. Uses testSet object initialized
 * in the beginning. Test on empty set uses a separate test SetStorer.
 * 
 * @author lornasong
 */
public class SetStorerTest {

	private SetStorer testSet;

	@Before
	public void initTestClass() {
		testSet = new SetStorer();
	}

	/**
	 * Test set creates it's own empty set to test deleting a string from an
	 * empty set
	 */
	@Test
	public void testDeleteFromEmptySet() {
		SetStorer testDeleteEmpty = new SetStorer();
		assertFalse("Deleted from an empty set",
				testDeleteEmpty.delete("empty"));
	}

	@Test
	public void testDeleteStringNotInSet() {
		testSet.add("string");
		assertFalse("Deleted string not in set", testSet.delete("missing"));
	}

	@Test
	public void testDeleteStringInSet() {
		testSet.add("delete");
		assertTrue("String existing in set must be deleted",
				testSet.delete("delete"));
	}

	@Test
	public void testAddDuplicateValues() {
		testSet.add("duplicate");
		assertFalse("Duplicate strings values should not be added",
				testSet.add("duplicate"));
	}
	
	@Test
	public void testAddValueAfterDeleted(){
		testSet.add("delete then add");
		testSet.delete("delete then add");
		assertTrue("Deleted strings should have capability to be re-added", testSet.add("delete then add"));
	}

}
