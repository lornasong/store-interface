package org.lsong.storer;

public interface Storer {

	/**
	 * Returns true if added, else false
	 */
	public boolean add(String s);
	
	/**
	 * Returns true if deleted, else false because string is not in list/set
	 */
	public boolean delete(String s);
	
}
