package org.lsong.storer;

/**
 * Stores things in collection.
 * @author lornasong
 *
 */
public interface Storer {

	/**
	 * Adds a string to list/set
	 * Returns true if added, else false
	 */
	public boolean add(String s);
	
	/**
	 * Removes a string from list/set (collection) (note: be ambiguous in language)
	 * Returns true if deleted, else false because string is not in list/set
	 */
	public boolean delete(String s);
	
}
