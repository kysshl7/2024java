package 프로그래밍문제;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. : ");
		String s = in.next();
		System.out.print("찾을 문자를 입력하세요. : ");
		char c = in.next().charAt(0);
		
		
		System.out.println(countChar(s, c));

	}
	
	static int countChar(String s, char c) {
		int count = 0;
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

}
