package 프로그래밍문제2;

public class 문제2 {
	interface Edible {
	    void eat();
	}

	interface Sweetable {
	    void sweet();
	}

	interface Delicious extends Edible,Sweetable {
	}
}
