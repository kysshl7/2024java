package 도전과제;

import java.util.Scanner;

public class 도전과제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfStudents = 0;
		int numOfScore = 0;
		int scores[];
		Scanner in = new Scanner(System.in);
		
		System.out.printf("학생 수? ");
		numOfStudents = in.nextInt();
		scores = new int[numOfStudents];
		
		System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
		for(int i=0; i<scores.length; i++) {
			numOfScore = in.nextInt();
			scores[i] = numOfScore;
			
		}
		System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i] + " ");
		}

	}

}
