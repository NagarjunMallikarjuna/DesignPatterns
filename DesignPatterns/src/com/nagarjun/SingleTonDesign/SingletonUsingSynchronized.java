package com.nagarjun.SingleTonDesign;

public class SingletonUsingSynchronized {

	private static SingletonUsingSynchronized INSTANCE;
	
	private  SingletonUsingSynchronized(){
		
	}
	
	public static synchronized SingletonUsingSynchronized getInstance(){
		if(INSTANCE==null){
			INSTANCE = new SingletonUsingSynchronized();
		}
		return INSTANCE;
	}
}
