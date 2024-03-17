package 프로그래밍문제;

import java.util.Scanner;

public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("화씨온도를 입려하세요 : ");
		double a = in.nextDouble();
		double b = (5 * (a - 32)) / 9;

		System.out.printf("환산한 섭씨온도는 %.1f입니다.", b);

	}

}
