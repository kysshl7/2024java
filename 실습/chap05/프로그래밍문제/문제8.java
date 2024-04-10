package 프로그래밍문제;

import java.util.Scanner;

public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String aDay = in.next();
		
		bDay(aDay.toUpperCase());
		System.out.println(bDay(aDay));

	}
	
	public static String bDay(String aDay) {
		return switch(aDay) {
		case "SUNDAY", "SATURDAY" -> "최고";
		case "MONDAY" -> "싫다.";
		case "FRIDAY" -> "좋다.";
		default -> "그저 그렇다.";
		};
	}

}

enum Day{
	SUNDAY("일요일"), MONDAY("월요일"), TUESDAY("화요일"), WEDNESDAY("수요일"), THURSDAY("목요일"), FRIDAY("금요일"), SATURDAY("토요일");
	
	private String s;
	
	Day(String s){
		this.s = s;
	}
	
	public String toString() {
		return s;
	}
}
