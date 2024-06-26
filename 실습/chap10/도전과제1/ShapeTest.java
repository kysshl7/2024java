package 문제1;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
	public static void main(String[] args) {
		List<Shape> circlefindGabType = findShapesByType(Shape.shapes, "사각형");
		System.out.println("사각형 : " + circlefindGabType);

		List<Shape> colorAreafindGabType = findShapesByColorNArea(Shape.shapes, "빨간색", 12.0);
		System.out.println("빨간 도형(면적<=12.0) : " + colorAreafindGabType);
	}

	public static List<Shape> findShapesByColorNArea(List<Shape> shapes, String color, double area) {
		List<Shape> result2 = new ArrayList<>();

		for (Shape colorArea : shapes) {
			if (colorArea.getColor().equals(color) && colorArea.getArea() < area) {
				result2.add(colorArea);
			}
		}
		return result2;
	}

	public static List<Shape> findShapesByType(List<Shape> shapes, String type) {
		List<Shape> result = new ArrayList<>();

		for (Shape shapeType1 : shapes) {
			if (shapeType1.getType().equals(type))
				result.add(shapeType1);
		}
		return result;
	}
}
