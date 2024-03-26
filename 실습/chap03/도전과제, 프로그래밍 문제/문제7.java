package 프로그래밍문제;

import java.util.Scanner;

public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c = input("철수");
		String y = input("영희");
		whosWin(c, y);

	}
	public static String input(String a) {
		Scanner in = new Scanner(System.in);
		System.out.print(a + " : ");
		a = in.next();
		return a;
		
	}
	
	public static void whosWin(String x, String y) {
		if(x.equals(y))
			System.out.println("무승부");
		else if((x.equals("r")&&y.equals("s"))||(x.equals("s")&&y.equals("p"))||
		(x.equals("p")&&y.equals("r")))
			System.out.println("철수, 승!");
		else
			System.out.println("영희, 승!");
	}

}
