package 도전과제;

import java.util.Scanner;

public class 도전과제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 1;
		int n;
		Scanner in = new Scanner(System.in);

		System.out.print("정수를 입력하시오 : ");
		n = in.nextInt();

		while (true) {
			if (n > 0) {
				result *= n;
				n--;
			} else
				break;
		}
		System.out.println(result);

	}

}
