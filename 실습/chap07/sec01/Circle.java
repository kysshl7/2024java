package chap07.sec01;

public class Circle extends Shape {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그립니다....");

	}

	public double findArea() {
		return pi * radius * radius;
	}

}
