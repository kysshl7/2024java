package 프로그래밍문제;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("나이를 입력하시요 : ");
		int x = in.nextInt();

		if (x >= 19)
			System.out.println("성년");
		else
			System.out.println("미성년");

	}

}
