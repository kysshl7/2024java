package 프로그래밍문제;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("등수를 입력하세요 : ");
		int x = in.nextInt();

		switch (x) {
		case 1 -> System.out.println("아주 잘했습니다.");
		case 2, 3 -> System.out.println("잘했습니다.");
		case 4, 5, 6 -> System.out.println("보통입니다.");
		default -> System.out.println("노력해야겠습니다.");
		}

	}

}
