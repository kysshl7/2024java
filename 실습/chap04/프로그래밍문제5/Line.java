package 프로그래밍문제5;

public class Line {
	int a;
	
	boolean isSameLine(Line b) {
		if(a == b.a) {
			return true;
		}
		else
			return false;
	}
	
	Line(int a){
		this.a = a;
	}

}
