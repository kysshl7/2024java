package chap07.sec01;

import java.awt.Rectangle;

public class sec01Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Shape s = new Shape();
		Circle c = new Circle(3);
		c.draw();
		System.out.printf("원의 넓이는 %.1f\n", c.findArea());

		Rectangle r = new Rectangle(3, 4);
		r.draw();
		System.out.printf("사각형의 넓이는 %.1f\n", r.findArea());

	}

}
