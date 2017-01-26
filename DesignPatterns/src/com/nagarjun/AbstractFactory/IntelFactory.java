package com.nagarjun.AbstractFactory;

public class IntelFactory implements CPUFactory{

	public CPU produceCPU(){
		return new IntelCPU();
	}
}
