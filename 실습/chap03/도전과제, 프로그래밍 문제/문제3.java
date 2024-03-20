package 프로그래밍문제;

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = 0;
		System.out.print("양의 정수를 입력하세요 : ");
		int b = in.nextInt();
		do {
			if (b % 2 == 0)
				a += b;
			System.out.print("양의 정수를 입력하세요 : ");
			b = in.nextInt();

		} while (b > 0);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + a);

	}

}
