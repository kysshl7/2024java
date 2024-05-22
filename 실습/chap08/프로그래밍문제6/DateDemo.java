package 프로그래밍문제6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println(ldt.format(fm1));
		System.out.println("오늘은 " + ldt.getMonthValue() + "월의 " + ldt.getDayOfMonth() + "번째 날");
		System.out.println("오늘은 " + ldt.getYear() + "년의 " + ldt.getDayOfYear() + "번째 날");

	}

}
