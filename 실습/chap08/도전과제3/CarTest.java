package 도전과제3;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("그랜저");
        Car yourCar = new Car("그랜저");

        StringTokenizer st = new StringTokenizer(yourCar.toString());

        Calendar cal = Calendar.getInstance();
        Date specificTime = cal.getTime();

        String equalsGab = "";
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        String dateGab = sdf.format(specificTime);

        String msf2 = MessageFormat.format("날짜: {1}, 자동차 모델={0}, 운전자(홍길동)", myCar.toString(), dateGab);
        StringTokenizer st2 = new StringTokenizer(msf2, " ,=()");
        
        while(st2.hasMoreTokens()) {
        	System.out.println(st2.nextToken());
        }

	}

}
