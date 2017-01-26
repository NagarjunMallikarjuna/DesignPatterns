package com.nagarjun.SingleTonDesign;

public class LazySingleton {

	private LazySingleton(){
		
	}
	
	private static LazySingleton single;
	
	public static LazySingleton getInstance(){
		
		single = new LazySingleton();
		
		return single;
	}

}
