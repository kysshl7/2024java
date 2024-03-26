package 프로그래밍문제;

import java.util.Scanner;

public class 문제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		if (isPrime(num))
			System.out.println(num + "는 소수입니다.");
		else
			System.out.println(num + "는 소수가 아닙니다.");

	}

	public static boolean isPrime(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0)
				return false;
		}
		return true;

	}

}
