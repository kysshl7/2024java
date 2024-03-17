package 프로그래밍문제;

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("알파벳을 입력하세요 : ");
		Scanner in = new Scanner(System.in);
		char c = in.next().charAt(0);
		int a = (int) 'A' - (int) 'a';
		char result = (char) ((int) c + a);

		System.out.print(result);

	}

}
