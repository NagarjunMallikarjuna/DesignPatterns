package com.nagarjun.Iterator;

public class RecordCollection implements IContainer{

	
	
	public IIterator createIterator(){
		RecordIterator iterator = new RecordIterator();
		return iterator;
	}
	
	
}
