package 도전과제;

import java.util.Scanner;

public class 도전과제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x;
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = in.nextInt();
		x = (a % 2 == 0) ? "짝수" : "홀수";
		System.out.println(x);

	}

}
