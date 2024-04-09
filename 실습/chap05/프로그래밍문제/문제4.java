package 프로그래밍문제;

import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		
		String a = "bye";
		String b = "com";
		String c = "java";
		do {
			System.out.print("URL을 입력하세요 : ");
			Scanner in = new Scanner(System.in);
			s = in.next();
			
			if(s.endsWith(b)) {
				System.out.println(s + "은 '"+b+"'로 끝납니다.");
			}
			if(s.contains(c)) {
				System.out.println(s + "은 '"+c+"'를 포함합니다.");
			}
		}while(!s.equals(a));
		
		
	}

}
