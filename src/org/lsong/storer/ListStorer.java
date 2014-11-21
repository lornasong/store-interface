package org.lsong.storer;

import java.util.ArrayList;
import java.util.List;
//TODO add javadoc
public class ListStorer implements Storer {
	
	private final List<String> listStore = new ArrayList<String>();

	@Override
	public boolean add(String s) {
		return listStore.add(s + "2");
	}

	@Override
	public boolean delete(String s) {		
		return listStore.remove(s);
		//return true;
	}
	
}
