package 프로그래밍문제;

import java.util.Scanner;

public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[5];
		Scanner in = new Scanner(System.in);
		System.out.print("문자열을 입력하시오: ");
		for(int i=0; num.length>i; i++) {
			num[i] = in.nextInt();
		}
		reverse(num);

	}
	public static int[] reverse(int[] org) {
		for(int i=5; i>0; i--) {
			System.out.print(org[i-1] + "");
		}
		return org;
	}

}
