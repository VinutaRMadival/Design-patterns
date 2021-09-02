package javaday3;

public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("drawing circle");//overriden abstract method
		
	}

	@Override
	public void print() {
		System.out.println("printing circle");
		
	}

}
