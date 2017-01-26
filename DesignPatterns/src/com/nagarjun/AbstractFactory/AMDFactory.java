package com.nagarjun.AbstractFactory;

public class AMDFactory implements CPUFactory{

	public CPU produceCPU(){
		return new AMDCPU();
	}
	
	
}
