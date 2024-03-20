package 프로그래밍문제;

import java.util.Scanner;

public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		String a = in.next();
		int b = 0;

		for (int i = 0; i < a.length(); i++) {
			b += Integer.parseInt(a.substring(i, i + 1));
		}

		System.out.print("각 자리 수의 합 = " + b);

	}

}
