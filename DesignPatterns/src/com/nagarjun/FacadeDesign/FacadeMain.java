package com.nagarjun.FacadeDesign;

public class FacadeMain {
	public static void main(String[] args) {
		ShapeMaker maker = new ShapeMaker();
		maker.drawCircle();
		maker.drawRectangle();
		maker.drawSquare();
	}
}
