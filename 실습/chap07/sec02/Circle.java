package chap07.sec02;

public class Circle extends Shape {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그리다.");

	}

	public double findArea() {
		return pi * radius * radus;
	}
}
