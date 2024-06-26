package 문제3;

import java.util.ArrayList;
import java.util.List;

public interface Predicate<Shape> {
	boolean test(Shape shape);
}

public class ShapeTest {
public static void main(String[] args) {
		List<Shape> circlefindGabType = findShapes(Shape.shapes, c -> c.getType().equals("사각형"));
		System.out.println("사각형 : " + circlefindGabType);

		List<Shape> colorAreafindGabType = findShapes(Shape.shapes,
				c -> c.getColor().equals("빨간색") && c.getArea() <= 12.0);
		System.out.println("빨간 도형(면적<=12.0) : " + colorAreafindGabType);
	}

	public static List<Shape> findShapes(List<Shape> shapes, Predicate<Shape> p) {
		List<Shape> result2 = new ArrayList<>();

		for (Shape typeColorArea : shapes) {
			if (p.test(typeColorArea)) {
				result2.add(typeColorArea);
			}
		}
		
		return result2;
	}
}

