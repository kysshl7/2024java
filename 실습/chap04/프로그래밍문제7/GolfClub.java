package 프로그래밍문제7;

public class GolfClub {
	int number;
	String name = "아이언";

	void print() {
		if(name.equals("아이언")) {
			System.out.printf("%d번 %s입니다.\n", number, name);
		}
		else System.out.printf("%s입니다\n", name);
	}
	GolfClub(String name){
		this.name = name;
	}
	GolfClub(int number){
		this.number = number;
	}
	GolfClub(){
		number = 7;
	}
}
