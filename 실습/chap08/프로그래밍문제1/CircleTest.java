package 프로그래밍문제1;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(3);

		if (c1.equals(c2)) {
			System.out.println("c1과 c2는 같다.");
		} else
			System.out.println("c1과 c2는 다르다");

	}

}
