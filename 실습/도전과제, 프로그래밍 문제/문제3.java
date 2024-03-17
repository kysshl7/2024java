package 프로그래밍문제;

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.14;
		Scanner in = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은? ");
		int a = in.nextInt();
		System.out.print("원기둥의 높이는? ");
		int b = in.nextInt();
		System.out.printf("원기둥의 부피는 " + a * a * b * pi);

	}

}
