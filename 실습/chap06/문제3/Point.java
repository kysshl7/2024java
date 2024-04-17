package 문제3;

public class Point {
	private int x, y;
	
	int getPointX() {
		return x;
	}
	
	int getPointY() {
		return y;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x 좌표 : "+x+", y 좌표 : "+y+"\n";
	}

}
