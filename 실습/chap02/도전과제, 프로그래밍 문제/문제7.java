package 프로그래밍문제;

import java.util.Scanner;

public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int a = in.nextInt();

		if (((a % 4) == 0) && ((a % 5) == 0)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (((a % 4) == 0) || ((a % 5) == 0)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if ((((a % 4) == 0) && ((a % 5) != 0)) || (((a % 4) != 0) && ((a % 5) == 0))) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
