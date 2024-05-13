package 프로그래밍문제7;

interface Flyable {
	void speed();
    void height();
}

public class FlyableTest {

	    public static void main(String[] args) {
	        Flyable f = new Flyable() {
	            @Override
	            public void speed() {
	                System.out.println("속도");
	            }

	            @Override
	            public void height() {
	                System.out.println("높이");
	            }
	        };
	        f.speed();
	        f.height();
	    }
}