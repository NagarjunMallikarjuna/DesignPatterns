package com.nagarjun.FrontController;

public class FrontControllerTest {

	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatcherRequest("HOME");
		frontController.dispatcherRequest("STUDENT");
	}
}
