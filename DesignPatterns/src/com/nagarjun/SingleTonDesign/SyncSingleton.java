package com.nagarjun.SingleTonDesign;

public class SyncSingleton {

	private SyncSingleton(){
		
	}
	
	private static SyncSingleton single;
	
	public static SyncSingleton getInstance(){
		
		if(single==null){
			synchronized (SyncSingleton.class) {
				single = new SyncSingleton();	
			}
		}
		return single;
	}

	

}
