package 도전과제;

import java.util.Scanner;

public class 도전과제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfStudents = 0;
		int numOfScore = 0;
		int scores[];
		int scores2[];
		Scanner in = new Scanner(System.in);
		
		System.out.printf("학생 수? ");
		numOfStudents = in.nextInt();
		scores = new int[numOfStudents];
		scores2 = new int[numOfStudents];
		
		System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
		for(int i=0; i<scores.length; i++) {
			numOfScore = in.nextInt();
			scores[i] = numOfScore;
			
		}
		System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
		for(int i : scores) {
			System.out.println(i + " ");
		}
		for(int i=0; i<scores2.length; i++) {
			scores2[i]=i;
			if(scores[i]>=90) {
				System.out.println((i+1) + "번 학생의 등급은 A입니다.");
			}
			else if(scores[i]>=80) {
				System.out.println((i+1) + "번 학생의 등급은 B입니다.");
			}
			else if(scores[i]>=70) {
				System.out.println((i+1) + "번 학생의 등급은 C입니다.");
			}
			else if(scores[i]>=60) {
				System.out.println((i+1) + "번 학생의 등급은 D입니다.");
			}
			else{
				System.out.println((i+1) + "번 학생의 등급은 E입니다.");
			}
		}


	}

}
