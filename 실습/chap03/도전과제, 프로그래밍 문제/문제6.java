package 프로그래밍문제;

import java.util.Scanner;

public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("철수 : ");
		String a = in.next();

		System.out.print("영희 : ");
		String b = in.next();

		if (a.equals("r")) {
			if (b.equals("r"))
				System.out.println("무승부");
			else if (b.equals("s"))
				System.out.println("철수, 승!");
			else if (b.equals("p"))
				System.out.println("영희, 승!");
		}

		if (a.equals("s")) {
			if (b.equals("r"))
				System.out.println("영희, 승!");
			else if (b.equals("s"))
				System.out.println("무승부");
			else if (b.equals("p"))
				System.out.println("철수, 승!");
		}

		if (a.equals("p")) {
			if (b.equals("r"))
				System.out.println("철수, 승!");
			else if (b.equals("s"))
				System.out.println("영희, 승!");
			else if (b.equals("p"))
				System.out.println("무승부");
		}

	}

}
