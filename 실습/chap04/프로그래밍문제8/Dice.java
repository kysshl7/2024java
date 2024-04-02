package 프로그래밍문제8;

public class Dice {
	int a;
	
	int roll() {
		return a;
	}
	
	Dice(){
		a = (int)(Math.random()*6)+1;
	}

}
