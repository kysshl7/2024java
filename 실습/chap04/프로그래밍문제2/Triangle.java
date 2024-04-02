package 프로그래밍문제2;

public class Triangle {
	private double a, b;
	
	double findArea() {
		return a*b*0.5;
	}
	
	String isSameArea(Triangle findArea) {
		if(findArea()==findArea.findArea()) {
			return "동일합니다.";
		}
		else
			return "동일하지 않습니다.";
	}
	
	double getA() {
		return a;
	}
	
	double getB(){
		return b;
	}
	
	Triangle(double a, double b){
		this.a=a;
		this.b=b;
	}

}
