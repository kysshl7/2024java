package 프로그래밍문제;

public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 1; a < 20; a++) {
			for (int b = 1; b < 20; b++) {
				for (int c = 1; c < 20; c++) {
					if ((a + b + c <= 20) && (a * a + b * b == c * c)) {
						System.out.printf("%d, %d, %d", a, b, c);
						System.out.println();

					}
				}
			}
		}

	}

}
