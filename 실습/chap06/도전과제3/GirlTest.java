package 도전과제3;

public class GirlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl[] girls = {new Girl("갑순이"), new GoodGirl("콩쥐"), new BestGirl("황진이")
	};
		for(Girl g : girls){
			g.show();
		}

    }
}
