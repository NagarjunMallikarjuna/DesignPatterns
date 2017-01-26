package com.nagarjun.SingleTonDesign;

public class SingleTon {
	private SingleTon(){
	}
	private static final SingleTon singleton = new SingleTon();
	public static SingleTon getInstance(){
		return singleton;
	}
}
