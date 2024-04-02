package 프로그래밍문제;

public class Triangle {
	private double a, b;
	
	double findArea() {
		return a*b*0.5;
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

