package org.lsong.storer;

import java.util.ArrayList;
import java.util.List;

public class ListStorer implements Storer {
	
	private final List<String> listStore = new ArrayList<String>();

	@Override
	public boolean add(String s) {
		return listStore.add(s);
	}

	@Override
	public boolean delete(String s) {		
		return listStore.remove(s);
		//return true;
	}
	
}
