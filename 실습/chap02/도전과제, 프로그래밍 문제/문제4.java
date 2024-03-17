package 프로그래밍문제;

import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		int a = in.nextInt();

		int b = a / 60;
		int c = b / 60;
		a = a % 60;

		System.out.printf("%d시간 %d분 %d초", c, b, a);

	}

}
