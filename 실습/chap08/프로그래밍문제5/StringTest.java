package 프로그래밍문제5;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show(new String("멘붕"));
		show(new StringBuilder("meltdown"));
		show(new StringBuffer("!@#"));

	}
	
	public static void show(Object o) {
		System.out.println(o);
	}

}
