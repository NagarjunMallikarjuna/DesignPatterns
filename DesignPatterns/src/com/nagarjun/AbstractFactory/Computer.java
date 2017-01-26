package com.nagarjun.AbstractFactory;

public class Computer {

	CPU cpu;
	
	public Computer(CPUFactory factory){
		cpu = factory.produceCPU();
		cpu.process();
	}
}
