package 프로그래밍문제5;

public class TV extends Controller {
	 @Override
	    String getName() {
	        return "TV";
	    }

	    public TV (boolean power) {
	        super(power);
	    }
}
