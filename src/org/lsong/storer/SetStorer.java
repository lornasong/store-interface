package org.lsong.storer;

import java.util.HashSet;
import java.util.Set;

public class SetStorer implements Storer{

	private final Set<String> setStore = new HashSet<String>();
	
	@Override
	public boolean add(String s) {
		return setStore.add(s);
		//return true;
	}

	@Override
	public boolean delete(String s) {
		return setStore.remove(s);
	}

}
